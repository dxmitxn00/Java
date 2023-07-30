package assignment;

// 10분 경과
public class Assign3 {

	public static void main(String[] args) {

		int hour = 1; // 계산 전 시간
		int minute = 10; // 계산 전 분
		
		int ch_hour = hour - 1; // 계산 후 시간
		int ch_minute = minute - 20; // 계산 전 분
		
		if(ch_hour <= 0) {
			ch_hour += 12;
		}
		
		if(ch_minute < 0) {
			ch_minute += 60;
		}
		
		System.out.println(hour + "시 " + minute + "분의 1시간 20분 전 시간은 "
		+ ch_hour + "시 " + ch_minute + "분입니다.");
	}

}
