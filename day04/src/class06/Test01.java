package class06;

public class Test01 {
	/*
	public static OUTPUT 함수명(INPUT) {

	}
	 */
	// public : 공개범위 -> 디폴트 // C언어는 private이 디폴트
	// static : "객체와 무관하게"
	// void : "아무것도 없음" -> 0이 아님
	
	// 함수 A유형(필기기준)
	public static void hello() { // 함수명은 '기능'을 유추할 수 있는 이름으로 만들기
		System.out.println("안녕하세요!");
	}
	// 함수를 정의(선언)했다.

	// 함수 B유형
	public static void printStar(int num) {
		for(int i=0; i<num; i++) {
			System.out.println("*");
		}
	}


	public static void main(String[] args) {

		System.out.println("메인함수");
		hello(); // 함수를 호출(사용)했다.
		// printStar(); -> 함수를 호출할 때에는 input, output을 정확히 맞춰서 사용해야 함
		printStar(5);
		hello();
		printStar(3);

	}

}
