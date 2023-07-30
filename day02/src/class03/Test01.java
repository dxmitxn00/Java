package class03;

// while문은 일반적으로
// "무한루프(반복문)" 일 때 활용함
public class Test01 {

	public static void main(String[] args) {

		// 프로그램에서 무한루프는 위험함
		// 웹개발에서,
		// 프로그램동작은 서버자원'을 사용함
		// -> '비용'이 발생함
		int i = 0;
		
		while(true) {
			// ㄴ> 무한루프 => break가 무조건 필요
			System.out.println("안녕!");
			i++;
			
			if(i==5) {
				break; // break문을 만나면 해당 반복문이 즉시 종료됨
				// break문은 반복문이랑만 씀
			}
		}
		// !!! 무한루프는 반드시 "종료조건'이 필요함 !!!
		// 에러아님
	}

}
