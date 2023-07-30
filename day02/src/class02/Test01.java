package class02;

// [ 반복문 ]
// 동일한 수행을 "여러번" 호출(사용)해야 할 때 활용 
public class Test01 {

	public static void main(String[] args) {
		
		/*
		int i = 0;
		while(i <= 100) {
			// 조건식이 참일 때 수행
			
			System.out.println("안녕하세요! :D");
			i++;
			
			// 닫는 블록에 닿으면 while(조건식)으로 돌아감
		} // 닫는 블록을 뚫고 나가는 일은 절대 없음, 닿으면 무조건 while문으로 돌아감
		*/
		
		int data = 10;
		while(data > 5) {
			System.out.println("현재 data: " + data);
			data -= 3;
		}
		
		System.out.println("최종 data : " + data);
	}

}
