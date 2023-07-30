package class05;

public class PracticeTest03 {

	public static void main(String[] args) {

		for(int l=0; l<3; l++) {
			
			for(int i=0; i<2-l; i++) {
				System.out.print(" ");
			}
			
			for(int j=0; j<l*2+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
