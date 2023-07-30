package assignment;

class Point{
	int x;
	int y;
	
	// 생성자 오버로딩 -> 초기화
	Point(){
		this(0,0);
	}
	
	Point(int num){
		
		this(num, num);
	}
	
	Point(int x, int y){
		
		this.x = x;
		this.y = y;
		
	}
	
	// 메소드
	void move() { // 각각 1씩 증가시켜줌
		
		this.move(1, 1); // 메소드는 공통된 부분이 많기 어려워서
						// 메소드안에 메소드 호출을 해서 생략하지 않는 것이 나음
		
	}
	
	void move(int num) { // 인자 하나를 받은 값을 둘다 증가시켜줌
		
		this.move(num, num);
		
	}
	
	void move(int x, int y){ // 두 인자를 받아서 각각 증가시켜줌
		System.out.printf("( "+ this.x +" , "+ this.y +" )");
		
		this.x += x;
		this.x += y;
		
		System.out.printf(" -> ( "+ this.x +" , "+ this.y +" )\n");
		System.out.println();
	}
	
	void printInfo() { // 현재 위치 출력
		System.out.println("현재 위치는 ( "+ this.x +" , "+ this.y +" ) 입니다.\n");
	}
}

public class Assignment01 {
	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point(10);
		Point p3 = new Point(2, 3);
		
		p1.printInfo();
		p2.printInfo();
		p3.printInfo();

		p1.move();
		p1.printInfo();
		p2.move(3);
		p3.move(4, 5);
		
		
		p2.printInfo();
		p3.printInfo();

		
	}

}
