package ctrl;

import java.util.ArrayList;

import model.MemberDAO;
import model.MemberVO;
import model.ProductDAO;
import model.ProductVO;
import view.View;

public class Ctrl {
	private MemberDAO mDAO;
	private ProductDAO pDAO;
	private View view;
	private MemberVO member; // 현재 로그인한 회원의 정보를 저장할 변수
	public Ctrl() {
		mDAO=new MemberDAO();
		pDAO=new ProductDAO();
		view=new View();
		member=null;
	}
	public void startApp() {
		while(true) {
			int action=view.printMenu();
			if(action==1) {
				ProductVO pVO = new ProductVO(0,null,0,0);
				pVO.setTmpSearch("전체목록");
				view.printList(pDAO.selectAll(pVO));
			}
			else if(action==2) { // 실습(이름,가격으로 검색하기)
				int num = view.getSearchNum();
				ProductVO pVO = new ProductVO(0, null, 0, 0);
				if(num == 1) { // 이름 검색
					String name = view.getNameSearch();
					pVO = new ProductVO(0, name, 0, 0);
					pVO.setTmpSearch("이름검색");
				}
				else if(num == 2) { // 가격 검색
					pVO = view.getPriceSearch();
					pVO.setTmpSearch("가격검색");
				}
				ArrayList<ProductVO> pdatas = pDAO.selectAll(pVO);
				view.printList(pdatas);
			}
			else if(action==3) {
				int proNum=view.getNum();
				ProductVO pVO=new ProductVO(proNum,null,0,0);
				ProductVO pdata=pDAO.selectOne(pVO);
				if(pdata==null) {
					System.out.println(" 로그: 해당상품없음");
					view.printFalse();
					continue;
				}
				if(pdata.getCnt()<=0) {
					System.out.println(" 로그: 상품재고없음");
					view.printFalse();
					continue;
				}

				if(!pDAO.update(pdata)) {
					System.out.println(" 로그: P update()안됨");
					view.printFalse();
					continue;
				}
				member.setTmpPrice(pdata.getPrice());
				member.setTmpUpdate("상품구매");
				// 개발 편의성때문에 새로 만든 VO의 멤버변수를 활용한 로직
				if(!mDAO.update(member)) {
					System.out.println(" 로그: M update()안됨");
					view.printFalse();
					continue;
				}
				view.printTrue();
			}
			else if(action==4) {
				if(!mDAO.insert(view.signin())) {
					view.printFalse();
					continue;
				}
				view.printTrue();
			}
			else if(action==5) {
				member=mDAO.selectOne(view.signin());
				if(member==null) {
					view.printFalse();
					continue;
				}
				view.printTrue();
			}
			else if(action==6) {
				member=null;
			}
			else if(action==7) { // 실습(회원비번변경)
				MemberVO mVO = new MemberVO(member.getMid(), view.getChangeMpw());
				mVO.setTmpUpdate("비번변경");
				mDAO.update(mVO);
			}
			else if(action==8) {
				if(member==null) {
					view.printFalse();
					continue;
				}

				if(!mDAO.delete(member)) {
					view.printFalse();
					continue;
				}
				member=null;
				view.printTrue();
			}
			else {
				break;
			}
		}
	}
}
