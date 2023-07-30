package class04;

public class Test04 {

	public static void main(String[] args) {

		// 3. 1부터 100까지 총합	

		int total = 0;
		
		for(int i=1; i<101; i++) {
			total += i;
		}
		
		System.out.println("1부터 100까지 총합: " + total);
	}

}

/*
 [ 코딩하는 순서 ]
 1) 주어진 것 == 데이터 먼저 파악 -> 변수 선언
 2) output을 생성(정의)-> 출력할 내용 파악 후 정의
 3) 수행할 문장 작성 -> 반복되는 문장 찾기
 */
