package class01;

// 변수 3요소, 함수 3요소
// 주석, 가독성
// 연산자-우선순위
// 제어문: 조건문, 반복문 --> 어디에 어떤걸 사용할 지
// 디버깅표 작성법

public class Test02 {

	public static void main(String[] args) {

		int[] stu = new int[3];
		// new 연산 : 메모리에 공간을 생성해줌 -> 연산자인 이유 : 함수가 아님
		
		// [ 인덱스 ]
		// [ index ]
		// 0부터 시작함
		stu[0] = 20;
		stu[1] = 50;
		stu[2] = 75;
		
		for(int i=0; i<3; i++) {
			System.out.println("학생 " + i + "의 점수는 " + stu[i] + "점입니다.");
		}
		

	}

}
