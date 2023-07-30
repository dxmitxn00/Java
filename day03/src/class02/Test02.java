package class02;

public class Test02 {

	public static void main(String[] args) {
		
		// 상황) 학생 N명
		// 총 점수 합
		// 평균 점수
		// 1등은 몇번?
		
		int[] stu = new int[5];
		stu[0] = 20;
		stu[1] = 26;
		stu[2] = 63;
		stu[3] = 51;
		stu[4] = 79;
		
		// 출력
		System.out.println("=== 학생 명단 ===");
		for(int i=0; i<stu.length; i++) {
			System.out.println("학생 " + (i+1) + "번은 " + stu[i] + "점입니다.");
		}
		System.out.println("==========================================");
		
		// 총 점수 합
		int sum = 0;
		for(int i=0; i<stu.length; i++) {
			sum += stu[i];
		}
		System.out.println("총점은 " + sum + "점입니다.");
		
		double avg = sum*1.0/stu.length; // 형변환(casting)
		System.out.println("평균은 " + avg + "점입니다.");
		
		// 최값 찾기 알고리즘
		int max = stu[0]; // 현재 최대값이 [0]에 존재하는 겂이다
		int maxIndex = 0; // 최대값이 저장된 학생의 index를 기억할 변수 -> 현재는 [0]이어서 0 값을 넣어줌
		
		// [1]부터 차례대로 '현재 최대값'과 비교
		for(int i=1; i<stu.length; i++) {
			if(max<stu[i]) { // 최대값이 현재 비교값보다 작으면 변화
				max = stu[i];
				maxIndex = i;
			}
		}
		System.out.println("1등한 학생은 " + (max+1) + "번 학생이고, 점수는 "+ max + "점입니다.");
	}

}
