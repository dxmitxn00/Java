package class04;

import java.util.Random;


public class PracticeTest01 {

	public static void main(String[] args) {
	
		// data배열 크기 랜덤 설정
		Random rand=new Random();
		int n=rand.nextInt(3)+3;
		
		int oSum=0; // 홀수 총합
		int eSum=0; // 짝수 총합
		int cnt=0; // 짝수 인덱스 개수
		int data2=0;
		
		// data에 저장될 정수 랜덤 설정
		int[] data=new int[n];
		int j=0;
		
		System.out.print("[ ");
		
		for(int i=0; i<data.length; i++) {
			data[i]=rand.nextInt(6)+100;
			System.out.print(data[i]+" ");
		}
		System.out.print("]\n");
		
		// forEach 구문 ㄱ
		// for(int v:data) { ... 
		for(int i=0; i<data.length; i++) {
			if(data[i]%2!=0) {	// 홀수들의 총합
				oSum += data[i];
			}
			else {	// 짝수들의 총합
				eSum += data[i];
				cnt ++;
			}
		}
		System.out.println("홀수 총합: "+oSum);
		
		// 짝수평균
		double eAvg=eSum*1.0/cnt;
		
		System.out.println("짝수 평균: "+eAvg);
		
		
		

	}

}
