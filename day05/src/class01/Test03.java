package class01;

import java.util.Random;
import java.util.Scanner;

// [ 과제 2 풀이 ]
/*
 * +++) 10개의 랜덤 수 배열(범위:1~100)
	사용자가 정수를 입력 ex) 50
	50은 [2](인덱스2)에 저장되어있습니다.
	50은 배열에 없습니다!
++++) 함수를 활용해 문제 해결
		최대 1개 활용 가능
 */
public class Test03 {

	// 1) 배열에 특정 정수가 있는 지 없는 지
	// 2) 있다면 몇 번 인덱스인 지
	// INPUT: int[] 1개, int 1개
	// OUTPUT: boolean, int -> 있는 지 없는 지 / 몇 번 인덱스 인 지
	//			=> 두 개 이상의 반환은 불가능
	//				int의 값에 이미를 부여하는 방식으로 해결
	public static int checkNum(int[] data, int num) {
		for(int i=0; i<data.length; i++) {
			if(data[i]==num) {
				return i;
			}
		}
		return -1; // false를 의미함
				//	==> 인덱스는 [0]부터니까 없다는 것을 의미
	}
	
	public static void main(String[] args) {

		Random rand = new Random();
		int[] data = new int[10];
		for(int i=0; i<data.length; i++) {
			data[i] = rand.nextInt();
		}
		System.out.print("[ ");
		for(int v:data) {
			System.out.println(v+" ");
		}
		System.out.println("]");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		int index=checkNum(data, num); // 변수 값으로 넣어 호출 횟수 줄임 -> 속도 향상
		if(index<0) { // 배열에 입력 값이 없으면 -1로 return 해주었기 때문에 음수로 판별
			System.out.println(num+"은 배열에 없습니다.");
		}
		else {
			System.out.println(num+"은 ["+index+"]에 저장되었습니다.");
		}

	}

}
