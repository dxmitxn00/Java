package class01;

import java.util.HashSet;

// [ 집합 ]
// 	: Set

public class Test02 {
	public static void main(String[] args) {
		
		// 추상클래스 Set
		// Set류의 부모클래스
		HashSet<Integer> data = new HashSet<Integer>();
		
		// 집합(Set)
		// 1. 순서가 없음 (index가 없음)
		// 2. 중복 허용 X
		// 3. 다양한 자료셩 저장 가능
		//		-> 하지만 이렇게 사용 안함
		//		=> 제네릭 <> 사용
		data.add(10);
		data.add(1234);
		data.add(213);
		data.add(342);
		data.add(10);
		data.add(10);
		data.add(324);
//		data.add("apple");
		
		System.out.println(data);
		System.out.println(data.size());
	}
}
