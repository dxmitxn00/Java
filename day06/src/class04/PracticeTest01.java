package class04;

// [ 원 ]

class Circle{
	String name; // 이름
	double radius; // 반지름
	double area; // 넓이
	
	void printInfo() {
		area = radius * radius * 3.14;
		System.out.println(name+"은 넓이가 "+area+"입니다.");
	}
}

public class PracticeTest01 {

	public static void main(String[] args) {

		// 객체 생성
		Circle c1=new Circle(); 
		Circle c2=new Circle();
		
		c1.name="축구공";
		c1.radius=2;
		
		c2.name="농구공";
		c2.radius=6;
		
		c1.printInfo();
		c2.printInfo();				
		
	}

}
