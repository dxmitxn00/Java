package class06;

public class Test04 {

	// 함수 C 유형
	public static String funcC() {
		
		System.out.println("funcC() 동작!");
		
		return "apple"; // 함수 즉시 종료됨 즉, return 뒤에 적히는 코드는 실행 안됨
	}
	
	public static void main(String[] args) {
		
		funcC(); // return값은 해당함수를 호출한 자리로 이동함
		System.out.println(funcC()); // funcC() 호출한 거 먼저 출력 -> main의 출력문 출력
		// 1. println() 해주세요
		// 2. funcC() 호출해주세요
		//	우선순위) 2 >> 1
		String msg = funcC();
		// 1. 대입연산자
		// 2. funcC() 호출해주세요
		//	우선순위) 2 >> 1
		System.out.println("msg : "+msg);

		// 1. 일반적으로 OUTPUT이 존재하는 함수들은
		// a) 출력하거나,
		// b) 변수에 저장하거나
		// 해서 활용
		
		// 2. return값은 해당함수를 호출한 자리로 이동
	}

}
