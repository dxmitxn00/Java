package class05;

// [ 중첩 반복문 (이중 for문) ]
// 구구단

public class Test01 {

	public static void main(String[] args) {

		for(int j=2; j<10; j++) {
			
			System.out.println("[ " + j + "단 ] \n");
			
			for(int i=1; i<10; i++ ) {
				System.out.println(j + " X " + i + " = " + (j*i));
			}
			
			System.out.println("\n-----------\n");

		}
	}

}
