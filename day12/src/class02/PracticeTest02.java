package class02;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeTest02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		int sum = 0; // 총합
		int index = 0; // 인덱스 값
		int cnt = 0; // 전체 카운트
		int eCnt = 0; // 짝수 카운트

		System.out.println("정수를 입력해주세요.");
		System.out.println("( 0을 입력하시면 종료됩니다.) ");

		while(true) {

			System.out.print("번호 입력 : ");
			int num = sc.nextInt();

			if(num == 0) { // 입력받은 수가 0이면
				double avg = (double)sum / cnt; // 캐스팅 잊지말기!!
				System.out.println("현재까지 입력한 정수들의 평균 : " + avg );
				System.out.println("입력한 정수 중 짝수가 몇 개 : " + eCnt );
				System.out.println("현재 남은 짝수들을 출력 : " + data );
				break;

			}

			data.add(num);
			sum += num; // 총합 더해주기
			cnt++; // 전체 입력받은 수 카운트

			if(num%2!=0) { // 입력받은 수가 홀수면
				data.remove(index);
			}
			else {
				eCnt++; // 짝수만 카운트
				index++;
			}

		}

	}
}
