package class02;

class A {
	int a; // 멤버변수, 필드, 속성
    // 인스턴스 변수
	//  ㄴ> 각각의 객체들이 고유한 값을 저장, 객체들끼리 값을 공유 X
	
	static int b;
	// 객체와 무관하게
	// 클래스 변수, 공유 자원
	// 
	void printInfo() {
		System.out.println("a = " +this.a);
		System.out.println("b = " +this.b);
		
	}
}

public class Test01 {
	public static void main(String[] args) {

		A a1 = new A();
		a1.a = 10;
		a1.b = 11;
	
		A a2 = new A();
		a2.a = 10;
		a2.b = 11;
		a2.a++;
		a2.b++; // 클래스 변수 b는 객체와 무관하게 공유를 하기 때문에
				// a1의 b에게도 값이 공유, 즉 a1.b랑 a2.b랑 같음
		
		a1.printInfo();
		a2.printInfo();

	}

}
