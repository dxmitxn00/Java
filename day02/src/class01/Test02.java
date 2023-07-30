package class01;

public class Test02 {

	public static void main(String[] args) {

		int age = 6;
		int result;

		if( age < 1 || 200 <= age) {
			System.out.println("유효하지 않은 값입니다.");
		}
		else {
			if(8 <= age && age <=19) {
				result = 1000;
			}
			else if(20 <= age && age <= 65) {
				result = 2000;
			}
			else { 
				result = 0;
			}

			if(result == 0) {
				System.out.println("무료");
			}
			else {
				System.out.println(result + "원 입니다.");
			}
		}
	}

}
