package class01;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
		
		/* [ 배열의 문제점 ]
		int[] data = new int[3];
		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
		System.out.println(data); // 주소값이 출력됨
		
		data[3] = 40; // 오류
		System.out.println(data[3]);
		*/
		
		// [ 향상된 배열 == 배열리스트 ]
		// 1. 데이터를 마음대로 저장 가능
		// 2. toString()이 오버라이딩되어 있음
		// 3. 다양한 기능의 메서드 기본 제공 -> add(), remove(), size(), ... 
		// 4. 서로 다른 자료형(타입)들도 저장가능(하지만 그렇게 안씀)
		//	=> 그러나, 반드시, 서로 같은 자료형만 취급!!
		//	=> 그래서 "강제성"을 부여함
		// 	ㄴ> 제네릭을 사용해 강제성이 부여됨!!!!
		// !!! 제네릭 <> : 일반화, 배열리스트에 저장될 타입 강제
		ArrayList<Integer> data = new ArrayList<Integer>();
		
		Integer i = new Integer(10);
		int ii = 10;
		
		data.add(10);
		data.add(0, 20); // 0번째 인덱스에 20 값을 넣어줌
		data.add(0, 30); // ㄴ> 다른 입력된 데이터 값을 밀어낼 수 있음
		data.clear(); // 전체 지우기
		data.add(10);
		data.remove(0); // 원하는 인덱스 값 지우기
		data.add(10);
		
		System.out.println(data.isEmpty()); // 값이 비어있나? boolean으로 확인
		System.out.println(data.get(0)); // 0번째 값 뽑아냄
		System.out.println(data.size()); // length의 역할
		System.out.println(data); // toString이 오버라이딩되어 있어서
									// 데이터 값이 출력됨
//		data.add("사과");
		data.add(3);
//		data.add(3.14);
		System.out.println(data);
	}
}
