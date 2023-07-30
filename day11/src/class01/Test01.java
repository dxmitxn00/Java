package class01;

class Student {
	private String name;
	private int score;

	Student(String name, int score){
		this.name = name;
		this.score = score;
		System.out.println(this.name + " 학생 생성 완료!");
	}

	// private 된 멤버 변수에 접근 가능하도록 하는 "메소드"를 추가로 생성
	// setter : 멤버 변수에 값을 설정해줌
	// getter : 멤버 변수에 값을 받아올 수 있도록 해줌

	// setter
	void setName(String name) {
		this.name = name;
	}
	void setScore(int score) {
		this.score = score;
	}

	// getter
	String getName() {
		return this.name;
	}
	int getScore() {
		return this.score;
	}

	@Override
	public String toString() {
		return this.name + " 학생은 " + this.score + "점입니다.";
	}
}


public class Test01 {
	public static void main(String[] args) {
		
		Student s1 = new Student("아리", 89);
		s1.setScore(95); // '로그'에 기록됨
		System.out.println(s1);
		
	}
}

// [ 로그 ]
// : 기록
// 하나의 코드로 여러 개발자들이 동시에 작업
//	ㄴ> 프로젝트 완성 시 기여도 측정
//		오류 발생 시 어떤 액션 + 어떤 기능에서 발생했는 지 기록
//		=> 메서드 위주로 기록됨 (단순 연산도 기록될 수 있지만 잘 안함)
//		=> 단순 연산자 x