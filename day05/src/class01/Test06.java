package class01;

// [ 오버로딩(overloading) ]
//	: 기능이 같은 함수
//	: 메소드 시그니처가 다른 경우에는
//		ㄴ> 인자의 개수, 자료형이 다른 경우
//	=> 함수명 중복 정의 허용

public class Test06 {
	public static int plus(int a,int b) {
		return a+b;
	}
	public static int plus(int a,int b,int c) {
		return a+b+c;
	}
	public static double plus(double a,double b) {
		return a+b;
	}
	public static double plus(double a,double b,double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		
		int res=plus(1,2);
		double res2=plus(3.1,2.3);
		
		
		// 오버로딩의 대표예시
		System.out.println(100);
		System.out.println("apple");
		
		// System.out.print();
		// 오버로딩이 되어있지않다!
		// 함수정의가 안되어있다!
		System.out.println();
		
	}
}
