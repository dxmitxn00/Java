package class01;

import java.util.Scanner;

// [ 과제 1 풀이 - 메소드 활용 ]
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

public class Test02 {
	
	// [ 메소드 만드는 순서 두 가지 ]
	// 1. 메소드 시그니처를 먼저 만들고, 기능 구현
	// 2. 기능을 먼저 만들고, 메소드 시그니처를 문제에 맞추는 법
	
	// [ 1번 방법 ]  : 90% 쓰이는 방식
	// Q1) 어떤 정수가 입력되었을 때(input), 짝수인지 아닌 지(output) 판별하는 함수
	// INPUT : int 1개
	// OUTPUT : boolean 
	public static boolean isEven(int num) {
		
		if(num%2==0) { // 짝수 판별 메소드
			return true; // return값 함수 즉시 종료
		}
		return false; // 짝수면 return true로 즉시 종료됨	
						// else 쓸 필요 없음
	}
	
	// [ 2번 방법 ]  : 스타트업, 초보자들이 사용하는 경우가 많음
	//				main에 기능을 완성시켜 그 묶음을 하나하나 분리해내는 과정
	//					====> 모듈화, 컴포넌트화
	//						장점) 코드 재사용성이 증가됨
	//							-> 오류감소
	//							-> 개발 시간 단축
	//							-> 개발 비용 절감
	//							-> 회사에 이익
	// Q2) main에 구현되어있던 기능을 뜯어서 func()에 우선 넣고 시작
	// INPUT, OUTPUT을 주지 않은 상태에서 기능 먼저 가져온 다음 메서드 시그니처 수정
	public static int isMinus(int num, int b) { 
		if(num<0) {
			b++;
		}
		return b; // main 메소드에서 활용해야하는 값을 return 해줌
	}
	
	// [ 1번 방법 ]
	// Q3) 어떤 정수가 0이면, 프로그램을 종료
	//		프로그램 종료 안내멘트 출력
	// INPUT: int 1개
	// OUTPUT: boolean -> 종료할지 말지
	/*
	 public static boolean check(int num) {
		if(num==0) {
			System.out.println("0이 입력되어 종료합니다.");
			System.out.println();
			return true;
		}
		return false; // 종료 안함
	}
	*/
	public static boolean check(int num) {
		if(num==0) {
			bye();
			return true;
		}
		return false; // 종료 안함
	}
	
	// 종료시 출력문 메소드
	public static void bye() { // 코드 재사용을 위해 최대한 잘게 분리함
		System.out.println("0이 입력되어 종료합니다.");
		System.out.println();
	}
	
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
			if(check(num)) { 
				break;
			}
			cnt++;
			
			if(isEven(num)) {
				a++;
			}
			
			b = isMinus(num, b); // return값으로 b를 가지니까 b 변수에 넣어줘야 함
								//	ㄴ> 메소드(함수)는 메모리 공간을 공유하지 않기 때문에
		}
		
		System.out.println(cnt+"번 입력완료했습니다."); // cnt++로 증가한 후 while문에서 false이기 때문에 cnt+1 안해도 됨
		System.out.println("짝수 개수: a = "+a+" 음수 개수: b = "+b);
		
	}

}
