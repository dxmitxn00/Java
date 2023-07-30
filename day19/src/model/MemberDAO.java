package model;

import java.util.ArrayList;

// 회원목록출력
// 회원가입,로그인,로그아웃,마이페이지,회원탈퇴
public class MemberDAO {
	private ArrayList<MemberVO> datas;
	public MemberDAO() {
		datas=new ArrayList<MemberVO>();
		datas.add(new MemberVO("admin","1234","관리자"));
		datas.add(new MemberVO("coding_helper","teemo","작은 티모"));
	}

	public ArrayList<MemberVO> selectAll(MemberVO mVO){
		return datas;
	}
	public MemberVO selectOne(MemberVO mVO){
		for(MemberVO v : datas) {
			if(mVO.getMid().equals(v.getMid())) { // 내가 받은 값이 datas에 있으면 걔 반환해
				if(mVO.getMpw().equals(v.getMpw())) { // 비밀번호 확인해보기
					return v;
				}
				System.out.println(" 로그: MemberDAO: selectOne(): 비밀버노가 일치하지 않습니다.");
				return null;
			}
		}
		System.out.println(" 로그: MemberDAO: selectOne(): 해당 아이디가 없습니다.");
		return null;
	}

	public boolean insert(MemberVO mVO) {
		boolean flag=false;
		for(MemberVO data:datas) {
			if(data.equals(mVO)) {
				flag=true;
				System.out.println(" 로그: MemberDAO: insert(): 아이디 중복");
				break;
			}
		}
		if(flag) {
			return false;
		}
		datas.add(new MemberVO(mVO.getMid(),mVO.getMpw(),mVO.getName()));
		/*
		1) datas.add(new MemberVO());
		 -> datas DB공간에 new 새로운 데이터를 추가
		2) MemberVO(데이터1,데이터2,데이터3)
		 -> 데이터들을 mVO에서 추출하면됨
		 */
		return true;
	}
	public boolean update(MemberVO mVO) { // 비밀번호 변경
		for(int i=0; i<datas.size(); i++) { // 전체에서
			if(datas.get(i).equals(mVO)) { // 나랑 같은 애 찾고
				if(mVO.getName().equals("비번변경")) { // 걔 이름이 비번변경이면
					datas.get(i).setMpw(mVO.getMpw()); // 변경할 비번 입력받은 거 저장해
					return true;
				}
				System.out.println(" 로그: MemberDAO: update: 비번변경 실패");
				return false;
			}
		}
		System.out.println(" 로그: MemberDAO: update: 해당 아이디 존재하지 않음");
		return false;
	}
	/* 강사님 코드(업데이트)
	 public boolean update(MemberVO mVO) {
      for(MemberVO v:datas) {
         if(v.equals(mVO)) {
            v.setMpw(mVO.getMpw());
            return true;
         }
      }
      return false;
   }
	 */
	public boolean delete(MemberVO mVO) {
		for(int i=0; i<datas.size(); i++) { // 전체에서
			if(datas.get(i).equals(mVO)) { // 나랑 같은 애 찾으면
				datas.remove(i); // 제거해줘
				return true;
			}
		}
		return false;
	}
}
