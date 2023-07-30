package class07;

public class Test01 {

	public static void main(String[] args) {
	
		int data = 10 > 5 ? 1 : 2;
		System.out.println(data);
		
		// a, b 비교해 더 큰 수 출력
		int a = 100;
		int b = 200;
		int result1 = a > b ? a : b;
		System.out.println(result1);
		
		// c가 짝수면 E, 홀수면 O를 출력
		int c = 9;
		char result2 = 9 % 2 == 0 ? 'E' : 'O';
		System.out.println(result2);
		// 스도코딩으로 정리
		// 한글로 먼저 풀어서 식을 적어보고 코드 수정
		
	}

}
