package class02;
import java.util.Random; // 단축키 : command+shift+O

public class Test03 {

	public static void main(String[] args) {
/*
		int[] stu = new int[6];
		stu[0] = 29;
		stu[1] = 99;
		stu[2] = 30;
		stu[3] = 22;
		stu[4] = 87;
		stu[5] = 57;
	*/
		
		// 랜덤으로 변수생성
		int[] stu = new int[6];
		Random rand = new Random(); // Random은 자바에서 제공해줌 -> 패키지 임포트 필요
		
		for(int i=0; i<stu.length; i++) {
			// stu[i] = 랜덤수;
			stu[i] = rand.nextInt(101);
			System.out.print(stu[i] + " ");
		}
		System.out.println();
		
		int sum = 0; // 전체 총점
		int cnt = 0; // 학생수
		int min = stu[0]; // 6등 학생 점수
		int minIndex = 0; // 6등 학생 번호
		int eSum = 0; // 짝수번째 총점
		int lowIndex = 0; // 평균 아래 학생 번호
		
		// 학생 명단
		System.out.println("============ 학생명단 ============");
		for(int i=0; i<stu.length; i++) {
			System.out.println("학생 " + (i+1) + "번: " + stu[i] + "점");
		}
		System.out.println("================================");
		
		// 평균점수
		for(int i=0; i<stu.length; i++) {
			sum += stu[i];
		}
		double avg = sum*1.0 / stu.length;
		System.out.println("전체 평균: " + avg + "점");
		
		// 평균을 넘긴 학생 수
		for(int i=0; i<stu.length; i++) {
			if(stu[i] > avg) {
				cnt++;
			}
		}
		System.out.println("평균을 넘긴 학생 수: " + cnt + "명");
		
		// 6등의 번호
		for(int i=0; i<stu.length; i++) {
			if(min > stu[i]) {
				min = stu[i];
				minIndex = i;
			}
		}
		System.out.println("6등 학생 번호: " + (minIndex+1) + "번");
		
		// 짝수번째 학생들의 총점
		for(int i=0; i<stu.length; i++) {
			if(i%2!=0) {
				eSum += stu[i];
			}
		}
		System.out.println("짝수번째 학생들의 총점: " + eSum + "점");
		
		// 평균을 못넘긴 학생들의 번호
		// ㄴ> 변수로 만들 수 없음
		//     :저장공간을 예상하는 방법
	    //     : 나중에 배열을 생성하는 방법
		System.out.print("평균 아래의 학생 번호: ");
		
		for(int i=0; i<stu.length; i++) {
			if(avg > stu[i]) {
				lowIndex = i;
				System.out.print((i+1) + "번 ");
			}
		}
	}

}
