package class05;

public class ExampleTest {

	public static void main(String[] args) {
		/*
		for(int j=0; j<5; j++) {

			for(int i=0; i<5; i++) {

				if(j > i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		 */

		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<5-i;k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
