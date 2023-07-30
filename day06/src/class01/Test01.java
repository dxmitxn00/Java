package class01;

import java.util.Random;
import java.util.Scanner;

// [ flag 알고리즘 ] 
//	: 특정 상황이 T인지 F인지 판단할 때 활용
//	: 이때 '특정 상황'이 반복뭄, 함수 등 처럼 시간이 좀 흘러야
//		범위를 모두 확인해야 알 수 있을 때 씀

public class Test01 {

	public static void main(String[] args) {

		int[] data=new int[5];
		Random rand=new Random();
		for(int i=0; i<data.length; i++) {
			data[i]=rand.nextInt(100)+1;
		}
		// data.length == 배열의 크기
		//			   != 저장되어있는 데이터의 개수
		
		System.out.print("[ ");
		for(int v:data) {
			System.out.print(v+" ");
		}
		System.out.println("]");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num=sc.nextInt();
		
		boolean flag=false; // OFF. 배열에 num이 없는 상황을 의미
		int index=-1;
		
		for(int i=0; i<data.length; i++) {
			if(data[i]==num) {
				flag=true; // 배열에 num이 있는 상황
				index=i;
			}
		}
		if(flag) {
			System.out.println(num+"은 ["+index+"]에 존재합니다.");
		}
		else {
			System.out.println(num+"은 존재하지 않습니다.");
		}

	}

}
