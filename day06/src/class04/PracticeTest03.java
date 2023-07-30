package class04;

// 자동차 클래스
// 변수 : 차주이름, 현재속도, 최대속도
// 메소드 : 스피드업, 스피드 다운
// 생성자 오버로딩

// 생성자 오버로딩
// 변수 초기화


// 스피드업 메소드
// 속도 증가
// 현속==최속 이면 과속 출력, 최대속도 못넘기게


class Car{
	// 변수
	String name; // 차주 이름
	int currentSpeed; // 현재속도
	int maxSpeed; // 최대속도
	
	// 생성자 오버로딩
	Car(){ // 기본
		this.name="무명";
		this.currentSpeed=50;
		this.maxSpeed=120;
		
		System.out.println(name+"님의 차는 [ "+currentSpeed+" / "+maxSpeed+" ] 입니다.\n");
	}
	
	Car(String name){ // 이름 인자
		this.name=name;
		this.currentSpeed=50;
		this.maxSpeed=120;
		
		System.out.println(name+"님의 차는 [ "+currentSpeed+" / "+maxSpeed+" ] 입니다.\n");
	}
	
	Car(String name, int maxSpeed){ // 이름, 최속 인자
		this.name=name;
		this.currentSpeed=50;
		this.maxSpeed=maxSpeed;
		
		System.out.println(name+"님의 차는 [ "+currentSpeed+" / "+maxSpeed+" ] 입니다.\n");
	}
	
	
	
	// 메서드
	void speedUp() {
		currentSpeed+=20;
		
		if(currentSpeed>=maxSpeed) {
			System.out.println("과속!");
			currentSpeed=this.maxSpeed;
		}
		System.out.println("속도 증가\n현재속도: "+currentSpeed+"\n");
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

public class PracticeTest03 {

	public static void main(String[] args) {
		Car car1=new Car();
		car1.speedUp();
		car1.speedDown();
		
		Car car2=new Car("홍길동");
		car2.speedUp();
		car2.speedUp();
		car2.speedUp();
		car2.speedUp();
				
		Car car3=new Car("임꺽정",200);
		car3.speedDown();
		car3.speedDown();
		car3.speedDown();
		car3.speedDown();
		car3.speedDown();
		
		

	}

}
