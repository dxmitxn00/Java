package model;

// 회원 데이터에 관한 VO
public class MemberVO {
	private String mid; // PK (회원에게 자동으로 부여되는 아이디)
	// : 일반적으로 PK는 시스템에서 부여함
	// : 사용자가 등록 --->> 중복검사필수 ☆
	private String mpw; // 회원 비밀번호
	private String name; // 회원 이름
	public MemberVO(String mid,String mpw,String name) {
		this.mid=mid; // 회원 PK 초기화
		this.mpw=mpw; // 회원 비밀번호 초기화
		this.name=name; // 회원 이름 초기화
	}
	
	// getter, setter
	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getMpw() {
		return mpw;
	}

	public void setMpw(String mpw) {
		this.mpw = mpw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// toString 오버라이딩
	@Override
	public String toString() {
		return this.name+"님";
	}

	// equals 오버라이딩, obj 다운캐스팅
	@Override
	public boolean equals(Object obj) {
		// 아이디(mid)가 같다면, 같은객체!
		MemberVO mVO=(MemberVO)obj; // obj를 mVO로 다운캐스팅
		// Object obj = mVO; mVO가 obj로 업캐스팅
		if(this.mid.equals(mVO.mid)) { // 객체가 가진(만들어져있는)PK와 인자로 받은(사용자가 입력한) PK의 데이터 값을 비교
										// PK 존재 유무 파악을 위한 코드
			return true;
		}
		return false;
	}
}
