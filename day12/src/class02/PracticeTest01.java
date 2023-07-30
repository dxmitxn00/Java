package class02;

import java.util.Random;
import java.util.HashSet;

public class PracticeTest01 {
	public static void main(String[] args) {
		
		Random rand = new Random();
		int size = rand.nextInt(10); // 배열 길이
		HashSet<Integer> data = new HashSet<Integer>(size);
		
		for(int i=0; i<size; i++) {
			
			int num = rand.nextInt(15)+1; // 랜덤 값
			data.add(num);
		}
		
		System.out.println("랜덤수는 "+ data.size() +"개 생성되었고,\n"
							+ data + " 입니다.");
		
	}
}
