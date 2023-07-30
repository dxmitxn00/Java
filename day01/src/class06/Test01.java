package class06;

public class Test01 {

	public static void main(String[] args) {
		// 정수 37이라는 값을 저장
		int data = 37; 
		// 변수 생성과 값 초기화를 한 번에 진행하는 것도 가능하다
		
//		System.out.println(10/3);
//		System.out.println(10%3);
		
		System.out.println("첫 data: " + data);
		
		// 하나의 변수 공간에는
		// 하나의 값 
		data = 10-3; // 컴퓨터는  하나하나의 일을 빨리 처리 -> 동시처리 못함
		System.out.println("지금 data: " + data);
	}

}
