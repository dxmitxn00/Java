package assignment;

// 7분 30초 경과
public class Assign1 {

	public static void main(String[] args) {
		
		int month = 6;
		
		if(month > 2 && month < 6) {
			System.out.println(month + "월 => 봄");
		}
		else if(month > 5 && month < 9) {
			System.out.println(month + "월 => 여름");
		}
		else if(month > 8 && month < 12) {
			System.out.println(month + "월 => 가을");
		}
		else {
			System.out.println(month + "월 => 겨울");
		}

	}

}

// 계절 변수를 선언해서 출력문을 하나로 통합하는게 나음
