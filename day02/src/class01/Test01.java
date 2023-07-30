package class01;

// !!! 유효성 검사 : 알맞지 않은 값이 입력되면 유효하지 않다고 뜨게 해야함
public class Test01 {

	public static void main(String[] args) {

		int month = 6;

		String season;

		if(month >= 1 && month <= 12) {

			if(month >= 3 && month <= 5) {
				season = "봄";
			}
			else if(month >= 6 && month <= 8) {
				season = "여름";
			}
			else if(month >= 9 && month <= 11) {
				season = "가을";
			}
			else {
				season = "겨울";
			}
			System.out.println("현재: " + season);
		}
		else {
			System.out.println("유효하지 않은 값입니다.");
		}


	}

}
