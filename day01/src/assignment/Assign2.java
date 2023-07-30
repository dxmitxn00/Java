package assignment;

// 4분 30초 경과
public class Assign2 {

	public static void main(String[] args) {

		int age = 24;
		
		if(age >= 8 && age <= 19) {
			System.out.println("8세~19세, 1,000원!");
		}
		else if(age >= 20 && age <= 65) {
			System.out.println("20세~65세, 2,000원!");
		}
		else {
			System.out.println("나머지는 무료!");
		}
	}

}
