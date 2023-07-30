package class04;

class Car3{
	String name;
	int speed;
	int max;

	Car3() {
		this.name="무명";
		this.speed=0;
		this.max=120;
	}
	Car3(String name) {
		this.name=name;
		this.speed=0;
		this.max=120;
	}
	Car3(String name, int max) {

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
	public class Answer03 {

		public static void main(String[] args) {
			Car3 car1=new Car3();
			car1.speedUp();
			car1.speedDown();

			Car3 car2=new Car3("홍길동");
			car2.speedUp();
			car2.speedUp();
			car2.speedUp();
			car2.speedUp();

			Car3 car3=new Car3("임꺽정",200);
			car3.speedDown();
			car3.speedDown();
			car3.speedDown();
			car3.speedDown();
			car3.speedDown();


		}

	}
}
