package class04;

import java.util.Scanner;

// JAVA의 기본 단위 == class
// 새로운 class를 만들 때엔 다른 class랑 겹치지 않게

// '학생' 코딩해줘
class Student{// 클래스는 대문자로 시작
	// 상태 : 멤버변수, 필드, 속성
	String name;
	int score;
	
	// 동작(기능) : 메서드, 멤버함수
	// 메서드는 함수에게 주어(주체)가 생긴 것
	// 메서드는 주어가 없으면 사용을 못함
	void hello() {
		System.out.println("안녕, 난 "+name+"(이)야");
		// hello 함수 안에서 name을 선언해주지 않아도
		// 같은 클래스 안에 있는 멤버들을 사용할 수 있음
		
	// static == "객체와 무관하게"
	// ㄴ> 클래스는 객체와 무관하지 않아서(관련되어서) static 쓰면 안됨
	}
}


public class Test01 {

	public static void main(String[] args) {
		
		int num=10;
		double d=3.14;
		Scanner sc=new Scanner(System.in);
		String str=new String("apple");
		
		// main에서 클래스 선언, 여러개 가능
		Student student1=new Student();
		// 클래스   객체   = new 생성자(); => 내가 새로운 타입을 만드는 것
		// 클래스는 자료형, 붕어빵틀의 역할			ㄴ> C언어으 구조체와 비슷함
		// 객체는 변수, 붕어빵
		// 클래스로부터 객체를 생성할 때에는
		// new 생성자()가 반드시 필요함
		// 객체를 생성하는 것 == 객체화(인스턴스화) --> 객체가 영어로 instance임
		// 교재, 유튜브, 인강, 블로그 등에서 말하는 "인스턴스"는 new연산자 사용해서 객체화 한 것
		Student student2=new Student();
		Student student3=new Student();
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3); // new연산자를 사용해서 heap 메모리에 저장됨
										// 출력하면 heap 메모리 주소값이 나옴
		student1.name="홍"; // student에 도트연산자를 했을 때 뜨는 색이 파란색이면 내가 만든 멤버
		student1.score=97;
		student2.name="길";
		student2.score=87;
		student3.name="동";
		student3.score=77;
		
		// . 멤버접근 연산자(도트 연산자)

		student1.hello();
		student2.hello();
		student3.hello();
	}

}
