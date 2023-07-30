package class06;

import java.util.Random;

public class PracticeTest01 {
	
	// 연습문제 1
	public static void test1() { // !!! 메소드 시그니처
		Random rand = new Random();
		int N = 10; // 배열 범위
		int num[]=new int[N]; // 랜덤수 받을 배열
		int sum = 0; // 입력받은 값 총합

		System.out.print("랜덤 수: ");
		for(int i=0; i<num.length; i++) {

			num[i] = rand.nextInt(11)+10;
			System.out.print(num[i]+" ");
			
			sum+=num[i];

		}
		System.out.println();
		System.out.println("랜덤 수의 총합: "+sum);
		
	}
	
	// 연습문제 2
	public static int test2(int num1, int num2) {
		int cnt=0;
		for(int i=num1; i<=num2; i++) {
			if(i%2==0) {
				cnt++;
			}
		}
		return cnt;
	}
	
	// 연습문제 3
	public static String test3(int num) {
		String msg="apple";
		if(num<=10) {
			msg="banana";
		}
		return msg;	
	}
	

	public static void main(String[] args) {

		test1();
		int cnt=test2(1, 15);
		System.out.println("cnt= "+cnt);
		System.out.println(test3(-11));
		

	}

}
