package ctrl;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;
import model.ProductDAO;
import model.ProductVO;
import view.AdminView;
import view.ClientView;

public class Ctrl {
	private MemberDAO mDAO;
	private ProductDAO pDAO;
	private AdminView admin;
	private ClientView client;
	private MemberVO member; // 현재 로그인한 회원 정보
	public Ctrl() {
		mDAO=new MemberDAO();
		pDAO=new ProductDAO();
		admin=new AdminView();
		client=new ClientView();
		member = null; // 세션 로그인 데이터
		// 프로그램을 실행한다고 해서, 자동로그인이 되지는 않기 떄문에
		// null로 초기화함
	}

	public void startApp() {
		while(true) {
			int action=client.printClientMenu01();
			if(action==1234) { // 관리자모드실행
				while(true) { // 관리자모드 진입
					action=admin.printAdminMenu();
					if(action==1) { // 회원목록출력
						ArrayList<MemberVO> mdatas=mDAO.selectAll(null);
						admin.printMemberList(mdatas);
					}
					else if(action==2) { // 관리자모드종료
						admin.printAdminEnd();
						break;
					}
				}
			}
			else if(action==1) { // 회원가입
				MemberVO mVO=client.signUp();
				boolean flag=mDAO.insert(mVO);
				if(flag) {
					client.signUpTrue();
				}
				else {
					client.signUpFalse();
				}
			}
			else if(action==2) { // 로그인

				// 아이디입력해봐! 라고 V가 사용자에게 요청
				// 비밀번호도 같이 입력해~

				// C는 이 정보가 있는 지, 그리고 맞는 지(==유효한 지)
				// 위의 여부를 M한테 판단을 부탁함
				//  --->> selectOne()

				// M은 VO를 반환 == 존재하는 회원
				//	-> 로그인 성공 V
				// 		=> 다음 스텝으로 이동
				//	  null을 반환 == 없거나, 비밀번호가 틀림
				//	-> 로그인 실패 V
				//		=> 프로그램 모드에 계속 있어야 함

				MemberVO mVO = client.signIn();
				// mVO에는 사용자가 입력한 아이디, 비밀번호가 저장되어 있음

				member = mDAO.selectOne(mVO); // mVO를 재활용함
				// 로그인 성공 -> 유효한 사용자 정보 or 로그인 실패 -> null
				// 유효한 사용자 정보 == 현재 로그인한 회원
				// mDAO.selectOne(client.signIn())!=null

				if(member == null) { // 로그인 실패 V -> 프로그램 계속 존재
					client.signInFalse();
					continue;
				}
				client.signInTrue(); // 로그인 성공 V -> 다음 스텝으로
				while(true) { // 사용자모드 진입
					action=client.printClientMenu02(member);
					if(action==1) { // 로그아웃

						// 사용자가 로그아웃을 원하면
						// C에 mVO가 현재 존재하는데, 이걸 제거하고

						// 로그아웃이 되었음을 사용자에게 알려주기
						// V -> C -> V

						member = null; // 현재 로그인한 회원을 null값을 주면서 로그아웃해줌						

						client.logout();
						client.printClientEnd02();
						break;
					}
					else if(action==2) { // 마이페이지(비밀번호 변경)
						// 비밀번호 변경하려면
						// 현재 비밀번호 확인
						// 일치하면, 변경 메세지
						// 변경할 비번 입력 받기
						// 비밀번호를 member에 저장해주기
						//  ㄴ> DAO에서 update호출
						//		member랑 같은 애가 있으면
						//		비밀번호가 저번애랑 같은지 비교
						//		같으면 실패
						//		다르면 성공
						// 변경완료

						// 비밀번호 불일치
						// 변겅 x

						String mpw = client.getMpw(); // 비밀번호 입력받기
						if(!member.getMpw().equals(mpw)) { // 비밀번호 불일치
							client.printFalse(); // 비밀번호 불일치 멘트
							continue;
						}
						// 일치하면
						mpw = client.getChangeMpw(); // 변경할 비밀번호 입력받기
						MemberVO changeMpw = new MemberVO(member.getMid(), mpw, "비번변경");
						if(!mDAO.update(changeMpw)) {
							System.out.println();
							client.printChangeMpwFalse(); // 비번 변경 실패
							continue;
						}
						client.printChangeMpwTrue(); // 비번 변경 성공
					}
					/* 강사님 코드(마이페이지(비밀번호 변경))
					 else if(action==2) { // 마이페이지
                  		String mpw=client.mypage(member);
                  		MemberVO mdata=new MemberVO(member.getMid(),mpw,null);
                  		boolean flag=mDAO.update(mdata);
                  		if(flag) {
                     		client.printMemberUpdateTrue();
                  		}
                  	 	else {
                     	client.printMemberUpdateFalse();
                  		}
               		}
					 */
					else if(action==3) { // 회원탈퇴

						// 현재 로그인한 상황

						// 비밀번호를 한 번 더 확인하는 로직
						// 비밀번호가 불일치 -> 회원탈퇴 x

						// 비밀번호 일치하면,
						// 로그인이 되어있는 회원을
						// 전체회원목록에서 제거

						String mpw = client.getMpw();
						if(!member.getMpw().equals(mpw)) { // 현재 로그인한 사람의 비밀번호와 사용자가 입력한 비밀번호를 확인하는 로직
							client.printFalse(); // 비밀번호 불일치 멘트
							continue;
						}
						if(mDAO.delete(member)) { // 회원탈퇴 실패
							client.printMemberDeleteFalse();
							continue;
						}
						client.printMemberDeleteTrue();
						client.printClientEnd02();
						break;
					}
					else if(action==4) { // 상품목록출력
						ArrayList<ProductVO> pdatas=pDAO.selectAll(null);
						client.printProductList(pdatas);
					}
					else if(action==5) { // 상품목록검색_이름으로 검색
						String name=client.getSearchContent();
						ProductVO pVO=new ProductVO(0,name,0,0);
						ArrayList<ProductVO> pdatas=pDAO.selectAll(pVO);
						client.printProductList(pdatas);
					}
					else if(action==6) { // 상품목록검색_가격으로 검색
						ProductVO pVO=client.getSearchFilter();
						ArrayList<ProductVO> pdatas=pDAO.selectAll(pVO);
						client.printProductList(pdatas);
					}
					else if(action==7) { // 상품검색_최고가 검색
						ProductVO pVO=new ProductVO(0,"최고가",0,0);
						ProductVO data=pDAO.selectOne(pVO);
						client.printProduct(data);
					}
				}

			}
			else if(action==3) { // 프로그램종료
				client.printClientEnd01();
				break;
			}
		}
	}
}
