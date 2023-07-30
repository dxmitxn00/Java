package class01;

import java.util.Scanner;

// [ 과제 1 풀이 - 메소드 활용 x ]
/*
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

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 입력 10번 받기 -> 반복문(while)문 활용
		// => 몇 번만에 끝날지 모름(0입력 받으면 종료하기 때문에)
		// for문은 반복 횟수를 정확히 알 때 
		int cnt=0;
		int a=0; // 짝수의 개수
		int b=0; // 음수의 개수
		
		while(cnt<10) { // 10번 입력될 때 까지
			// 사용자 편의성 고려
			// UI/UX
			System.out.print((cnt+1)+"정수 입력: ");
			int num=sc.nextInt();
			if(num==0) { // 0이 입력되었을 때 while문 탈출
				System.out.println("0이 입력되어 종료됩니다.");
				System.out.println();
				break;
			}
			cnt++;
			
			if(num%2==0) {
				a++;
			}
			if(num<0) {
				b++;
			}
		}
		
		System.out.println(cnt+"번 입력완료했습니다."); // cnt++로 증가한 후 while문에서 false이기 때문에 cnt+1 안해도 됨
		System.out.println("짝수 개수: a = "+a+" 음수 개수: b = "+b);
		
	}

}
