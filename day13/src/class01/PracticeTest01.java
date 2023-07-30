package class01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// [ 예외처리 연습문제 ]

public class PracticeTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> data = new ArrayList<Integer>();
		int num = 0; // 입력받은 정수
		int maxIndex = 0; // 가장 큰 수 인덱스값
		int sum = 0; // 남은 정수 합
		int cnt = 10; // 정수 입력 횟수

		System.out.println("정수를 입력하세요");

		// 입력받은 값 모두 출력
		while(data.size()<cnt) { // 입력받은 값이 10개면 종료
			try {
				System.out.print("정수 입력 : ");
				num = sc.nextInt();
				data.add(num); // 배열리스트에 넣기
			}
			// 입력 값이 정수가 아닐 때
			catch(InputMismatchException e) {
				sc.nextLine(); // 버퍼에 남은 쓰레기값 지워줌
				System.out.println("정수로만 입력해주세요");
			}
		}

		System.out.println("입력받은 모든 정수 출력 )");
		System.out.println(data);

		// 입력받은 값의 음수 제거
		int i=0;
		while(i<data.size()) {
			if(data.get(i) <= 0) { // 0포함 음수면
				data.remove(i);
			}
			else{
				i++;
			}

		}
		
		System.out.println("입력받은 모든 정수의 양수만 출력 )");
		System.out.println(data);
		
		// 큰 값 고르기
		int max = data.get(0);
		for(i=0; i<data.size(); i++) {
			
			if(data.get(i) > max) { // i인덱스가 i+1인덱스보다 크면
				maxIndex = i; // 더 큰값의 인덱스 값 저장
				max = data.get(i); // 더 큰 값을 저장
			}
			
			// 남은 정수 총합 저장
			sum += data.get(i);
		}

		System.out.println("그 중 가장 큰 정수의 인덱스 출력 )");
		System.out.println(maxIndex +"번");

		// 총합에서 max 값 제외해서 평균 구하기
		sum -= max;
		double avg = sum*1.0 / (data.size()-1); // data 배열리스트에 max 값이 저장되어있어서
												// 제외해줘야함

		System.out.println("남은 정수들의 합 )");
		System.out.println(sum);
		System.out.println("평균 )");
		System.out.println(avg);

	}
}
