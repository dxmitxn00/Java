package class03;

public class Test02 {


	public static void main(String[] args) {

		int a = 33;
		int b = 29;
		
		if(a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		// int num = a > b ? b : a; -> 최솟값 구하는 삼항연산자(위에 if문 대신 활용가능)
		
		while(true) {
			System.out.print(b + " ");
			b++;

			if(b > a) {
				break;
			}
		}
	}

}


////연습문제)
////a부터 b까지 출력
////a = 33
////b = 29
////출력: 29 30 31 32 33
////무한루프 활용해서 출력
