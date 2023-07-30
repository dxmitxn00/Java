package class01;

public class Test03 {

		public static void main(String[] args) {

			int hour = 1; // 계산 전 시간
			int minute = 10; // 계산 전 분
			
			System.out.println(hour + "시 " + minute + "분의 1시간 20분 전 시간은 ");
			
			hour--;
			minute -= 20;
			
			if(hour <= 0) {
				hour += 12;
			}
			
			if(minute < 0) {
				minute += 60;
			}
			
			System.out.println(hour + "시 " + minute + "분입니다.");
		}

	}
// 들여쓰기 = 덱스
// 덱스 정렬 = 커맨드 + i
