package class04;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {

		// 1. 문제
		// 2. 풀이
		// 3. 2 -> 코드
		
		// 1. N개의 랜덤수를 생성
		// 2. 랜덤수는 1~10까지 중에서 생성됨
		// 	  ex) 6 : 10 1 2 2 3 4
		// 3. 이 랜덤수들의 평균을 출력
		// 4. 평균보다 높은 값들을 '저장', 이후에 출력
		
		// !!! 풀이를 한국어로 작성해서(스도코드)!!!
		// 1. Random을 생성
		// 2. N을 결정해야함
		// 3. N개만큼의 랜덤수를 생성
		// 4. 총합 ---> 평균
		// 5. 평균보다 높은 값들을 저장할 공간 생성
		// 6. 5의 공간에 값 저장
		// 7. 6을 출력
		
		// [1]
		Random rand = new Random();
		int N = rand.nextInt(10)+1; // 변수는 소문자로 하는 게 맞지만, 한글자일 땐 대문자를 쓰기도 함
		// rand.nextInt(101) ---> 0~101
		// rand.nextInt(10)+1 ---> 1~10
		
		// [3]
		// 배열쓰고싶다
		// : 배열 3요소를 모두 만족하므로 사용가능
		int[] data=new int[N];
		for(int i=0; i<data.length; i++) {
			data[i]=rand.nextInt(10)+1;
		}
		System.out.println("N: " + N);
		
		// [4]
		int sum=0;
		// 향상된 for문 == forEach
		for(int v : data) { // forEach문: 클론 기준 오른쪽에 있는 값을 하나씩 보여줌
			System.out.println("랜덤수: "+v);
			sum+=v;
		}
		
		System.out.println("총합: "+sum);
		
		double avg=sum*1.0/data.length;
		System.out.println("평균: "+avg);
		
		// [5] 평균보다 높은 값들을 저장할 공간 생성
		// 배열 3요소 확인 중...
		//	: 현재 배열의 개수를 알 수가 없다
		//		a) 예상
		//		b) 확인 후 배열 생성 --> "평균보다 높은 값은 몇개인지"
		int num = 0;
		for(int v:data) {
			if(v>avg) { // 평균보다 높나?
				num++;
			}
		}
		System.out.println("평균보다 높은 값들은 "+num+"개"); // b) 완료
		
		int[] data2=new int[num];
		
		// [6]
		int j=0; // data2 배열에 대한 인덱스 담을 변수
		for(int i=0; i<data.length; i++) {
			if(data[i]>avg) {
				data2[j++]=data[i]; // data2[i]로 들어가면 순차적으로 데이터가 들어가지 않고 if에 대해
									// False 일때 빈공간으로 넘어감 -> 인덱스값이 밀림 => 예외뜸
				// => data[i]를 data2[j]에 대하고 j가 한칸이동
			}
		}
		
		// [7]
		System.out.print("평균보다 큰값은... ");
		for(int v:data2) {
			System.out.print(v+" ");
		}
		System.out.println("입니다.");
	}

}
