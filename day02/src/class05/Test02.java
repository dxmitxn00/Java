package class05;

// [ 중첩 반복문 (이중 for문) ]
// 별찍기 ==> 디버깅 표를 그려야 가능

public class Test02 {

	public static void main(String[] args) {

		for(int j=0; j<3; j++) {
			
			for(int i=0; i<j+1; i++) {
			
				System.out.print("*");
				
			}
			
			System.out.println();
		}
	}

}
