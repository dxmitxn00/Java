package class08;

public class Test03 {

	public static void main(String[] args) {

		int a = 4;
		
		// 만약, a가 10의 배수라면
		// [ 10의 배수입니다! ]
		// >> 위 상황을 추가하고싶어!!
		
		if (a % 10 == 0) { // a가 10의 배수인가
			System.out.println("10의 배수입니다!");
		}
		else if(a % 2 == 0) { // 위 조건이 아니면 짝수인가
			System.out.println("짝수입니다.");
		} // esle if는 무한개로 추가가 가능
		else {
			System.out.println("홀수입니다.");
		}
		// 코드는 위에서 아래로 흐름, 순서의 중요!! 짝수가 10의 배수 위에 있으면 원하는 답이 나오지 않음
		// !!!! 조건문은 범위가 적은 것부터 넓은 순서대로 !!!!
	}

}
