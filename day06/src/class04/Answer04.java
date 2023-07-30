package class04;

class Car4{
	String name;
	int speed;
	int max;
/*
 * 
 * 생성자가 반복되면 간단하게 쓸 수 있음
 * => 인자 수가 많은 생성자를 먼저 만듦
 *		먼저 만든 생성자를 호출하면서 다른 생성자 만듦
	Car4() {
		this.name="무명";
		this.speed=0;
		this.max=120;
	}
	Car4(String name) {
		this.name=name;
		this.speed=0;
		this.max=120;
	}
	Car4(String name, int max) {

		this.name=name;
		this.speed=0;
		this.max=max;
	}
	*/
	// 짧게 줄인 생성자 코드
	Car4() {
		this("무명", 120);
	}
	Car4(String name) {
		this(name, 120);
	}
	Car4(String name, int max) {

		this.name=name;
		this.speed=0;
		this.max=max;
	}

	void printInfo() {
		System.out.println(name+"님의 차는 [ "+this.speed+" / "+this.speed+" ] 입니다.\n");
	}
	void speedUp() {
		this.speed+=100;
		if(this.speed>this.max) {
			this.speed=this.max;
			System.out.println("과속!");
		}
	}
	void speedDown() {
		this.speed-=5;
		if(this.speed<=0) {
			this.speed=0;
			System.out.println("정지!");
		}
	}
	public class Answer04 {

		public static void main(String[] args) {
			Car4 car1=new Car4();
			car1.speedUp();
			car1.speedDown();

			Car4 car2=new Car4("홍길동");
			car2.speedUp();
			car2.speedUp();
			car2.speedUp();
			car2.speedUp();

			Car4 car3=new Car4("임꺽정",200);
			car3.speedDown();
			car3.speedDown();
			car3.speedDown();
			car3.speedDown();
			car3.speedDown();


		}

	}
}
