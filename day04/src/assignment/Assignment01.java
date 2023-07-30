package assignment;

import java.util.Scanner;

/*
 * [ 과제 ]
1. main()에서 정수를 10번 입력할 예정
2. if(짝수야?) => a++
3. if(음수야?) => b++
4. 10번 입력완료했씁니다. a=000, b=000 입니다.
5. 만약 입력된 정수가 0이라면 프로그램을 종료
	3번 입력완료되었습니다. a=ooo, b=000입니다.
	=> 10번 다 못채워도 0이 입력되면 종료

+) 함수를 활용해서 문제 해결
	함수는 최대 3개까지 활용 가능

 */
public class Assignment01 {

	// 음수 판별 메소드
	public static void isE (int num) {
		int a=0;

		if(num%2==0) {
			a++;
		}

	}
	
	// 음수 판별 메소드
	public static void isM (int num) {
		int b=0;
		
		if(num<0) {
			b++;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num=0; // 입력받을 변수
		int cnt=0; // 입력받은 횟수
		int a=0;
		int b=0;
		
		// 정수 10개 받기
		for(int i=0; i<10; i++) {
			System.out.print("정수 입력: ");
			num=sc.nextInt();
			
			// 0 입력받으면 종료
			if(num==0) {
				break;
			}
			isE(num);
			isM(num);
			cnt++;
		}
		System.out.println(cnt+"번 입력받았습니다."+"a = "+a+" b = "+b);

	}

}
