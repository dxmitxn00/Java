package class01;

// "포켓몬" 객체는 없는 것 아닌가?
// "피카츄, 파이리" 객체만 있으면 되는 거 아닌가?

// [ 추상 클래스 ]
// "객체화" 하는 것이 목표가 아니라,
// 설계를 하는 것이 목표였던 클래스들
// "클래스 들의 기준이 되는 것이 목표임" => 동물(눈,코,입,귀,꼬리) : 객체화 불가능

abstract class Shape {
	String name;
	double area;
	abstract void draw();  // 추상 메소드 : 무조건 오버라이딩해야함, 블록문 가질 수 없음
}


class Rect extends Shape {
	@Override
	void draw() {
		System.out.println("네모 그리기");
	}
}

class Cir extends Shape {
	@Override
	void draw() {
		System.out.println("원 그리기");
	}
}

class Tri extends Shape {
	@Override
	void draw() {
		System.out.println("세모 그리기");
	}
}

public class Test02 {
	public static void main(String[] args) {

		Cir c = new Cir();
		c.draw();

	}
}

