package class05;

public class PracticeTest02 {

	public static void main(String[] args) {

		for(int k=0; k<5; k++) {
			
			for(int j=0; j<4-k; j++) {
				System.out.print(" ");
			}
			
			for(int i=0; i<1+k; i++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
