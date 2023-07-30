package class06;

import java.util.Scanner;

public class Test03 {

	public static void printGrade(int score) {

		// 유효성검사
		if(score<0 || 100<score) {
			System.out.println("점수가 유효하지 않습니다! 확인이 필요합니다!");
			return; // 함수가 즉시 종료됩니다.
			// 리턴이 없으면 함수가 계속 돌아감
		}

		char grade = 'C';
		if(80<=score && score<=100) {
			grade = 'A';
		}
		else if(60<=score) {
			grade = 'B';
		}

		System.out.println(score+"점은 "+grade+"등급입니다.");
	}


	public static void main(String[] args) {
		System.out.print("점수 입력: ");

		Scanner sc = new Scanner(System.in);

		int score = sc.nextInt();
		printGrade(score);
	}

}

