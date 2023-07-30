package class01;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
public class Test03 {
	   public static void main(String[] args) {
	      // 정상적인 입력을 3번할때까지 계속

	      Scanner sc=new Scanner(System.in);

	      for(int i=0;i<3;i++) {
	         try {

	            System.out.print("정수입력) ");
	            int num=sc.nextInt();
	            System.out.println("num= "+num);

	         }
	         catch(InputMismatchException e) {
	            sc.nextLine(); // 버퍼에 남아있는 쓰레기값을 제거하는 코드
	            System.out.println("정수로만 입력하셔야합니다 ㅠㅠ...");
	         }
	      }

	   }
	}
*/


public class Test04 {
	public static void main(String[] args) {
		// 정상적인 입력을 세번할 때까지 계속
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int num;
		while(cnt < 3) {
			try {
				System.out.print("정수 입력 :");
				num = sc.nextInt();
				System.out.println("num = "+ num);
				cnt++;
			}
			
			catch(InputMismatchException e) {
				sc.nextLine(); // 버퍼에 남아있는 쓰레기값을 제거하는 코드
				System.out.println("정수로만 입력하세요..");
			}
		}
	}
}
