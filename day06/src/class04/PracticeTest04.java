package class04;

// 심화

class Car1{
	// 변수
	String name; // 차주 이름
	int currentSpeed; // 현재속도
	int maxSpeed; // 최대속도
	
	// 생성자 오버로딩
	Car1(){ // 기본
		this.name="무명";
		this.currentSpeed=50;
		this.maxSpeed=120;
		
		System.out.println(name+"님의 차는 [ "+currentSpeed+" / "+maxSpeed+" ] 입니다.\n");
	}
	
	Car1(String name){ // 이름 인자
		this.name=name;
		this.currentSpeed=50;
		this.maxSpeed=120;
		
		System.out.println(name+"님의 차는 [ "+currentSpeed+" / "+maxSpeed+" ] 입니다.\n");
	}
	
	Car1(String name, int maxSpeed){ // 이름, 최속 인자
		this.name=name;
		this.currentSpeed=50;
		this.maxSpeed=maxSpeed;
		
		System.out.println(name+"님의 차는 [ "+currentSpeed+" / "+maxSpeed+" ] 입니다.\n");
	}
	
	
	
	// 메서드
	void speedUp(int up) {
		currentSpeed+=up;
		
		if(currentSpeed>=maxSpeed) {
			System.out.println("과속!");
			currentSpeed=this.maxSpeed;
		}
		System.out.println("속도 "+up+" 증가\n현재속도: "+currentSpeed+"\n");
	}
	
	void speedDown() {
		currentSpeed-=10;
		
		if(currentSpeed<=0) {
			System.out.println("정지!!!");
			currentSpeed=0;
		}
		System.out.println("속도 감소\n현재속도: "+currentSpeed+"\n");
	}
	
}

public class PracticeTest04 {

	public static void main(String[] args) {
		Car1 car1=new Car1();
		car1.speedUp(23);
		car1.speedDown();
		
		Car1 car2=new Car1("홍길동");
		car2.speedUp(49);
		car2.speedUp(32);
		car2.speedUp(88);
		car2.speedUp(21);
				
		Car1 car3=new Car1("임꺽정",200);
		car3.speedDown();
		car3.speedDown();
		car3.speedDown();
		car3.speedDown();
		car3.speedDown();
		
		

	}

}
