package class01;

import java.util.Random;

// [ 메서드 시그니처 ]
//	메서드의 3요소
//	1.input 2.output 3.기능
// 	public static int makeRandNum(int start, int end)
//		ㄴ> 위 코드처럼 보자마자 유추가 가능하게 작성

public class Test02 {

	// [ 함수 제작하는 두 가지 방법 ]
	//  1) 메서드 시그니처를 먼저 정의하고,
	//		내부 기능을 구현

	// 시작 범위부터 끝 범위까지 중에서
	// 랜덤으로 ㅈ어수 1개를 출력 --> 출력만 해줄거라 반환값 필요 없음
	// OUTPUT: void / INPUT: int 2개 (start, end)
	// 실무에서는 start, end 보다는 L(low), H(high)
	//							L(left), R(right) 두 가지를 더 많이 씀
	public static void printRandNum(int start, int end) {
		Random rand=new Random();

		int randNum=rand.nextInt(end-start+1)+10;
		System.out.println("랜덤 수: "+randNum);
	}
	
	//  2) 내부 기능 가져오고
	//		그 기능에 맞게 메서드 시그니처 작성
	
	public static int makeRandNum(int start, int end) {
		Random rand=new Random();

		int randNum=rand.nextInt(end-start+1)+10;
		
		return randNum;
	}

	public static void main(String[] args) {

		int start=10;
		int end=20;
		
		printRandNum(start, end);
		
		int randNum=makeRandNum(10, 20);
		System.out.println("랜덤 수: "+randNum);

	}

}
