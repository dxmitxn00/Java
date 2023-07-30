package class04;

import java.util.Random;

public class PracticeTest02 {

	public static void main(String[] args) {

		// [ 복습 가이드 ]

		Random rand=new Random();
		int randNum=rand.nextInt(3)+3;
		int[] data=new int[randNum];

		int index=0; // 현재위치를 나타내는 변수
		while(index<data.length) { // data 배열이 완성될때까지 계속
			data[index]=rand.nextInt(6)+100; // 랜덤수를 열심히 저장하고,

			// [ flag 알고리즘 ]
			boolean flag=false; // 초기상태


			// 특별한 일이 발생하면,
			// ㄴ 특별한 일 == 데이터중복
			for(int i=0; i<index; i++) {
				if(data[i]==data[index]) {
					flag=true;
				}
			}



			// 잘 되었다면
			if(flag) {
				continue; // 아래로 내려가면 안돼
			}
			index++;

			/*
			다른 if문 형태

			if(data[index]가 이전에 없으면 ) {
				index++;
			}
			 */
		}
		/*
		 * 
		1) while(data 배열이 완성될 때까지 계속) {

		}
		2) while(true) {
			if(data 배열이 완성되었니?) {
				break;
			}
		}

		 */
		
		for(int v:data) {
			System.out.println(v);
		}

	}

}
