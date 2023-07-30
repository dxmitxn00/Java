package class02;

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

	@Override
	public boolean equals(Object obj) {

		Point p = (Point)obj; // obj는 equals 비교대상

		if(this.x == p.x && this.y == p.y) {
			return true;
		}

		return false;
	}


}

class ColorPoint extends Point {
	String color;

	ColorPoint(String color, int x, int y){
		super(x, y);
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj) {

		ColorPoint c = (ColorPoint)obj;

		if(this.color.equals(c.color) && this.x == c.x && this.y == c.y) {
			return true;
		}

		return false;
	}
}

public class PracticeTest01 {
	public static void main(String[] args) {

		// 실습 1
		Point[] data = new Point[3];
		data[0] = new Point(10, 20);
		data[1] = new Point(123, 20);
		data[2] = new Point(10, 20);

		// 주소값이 같을 때
		if(data[0].equals(data[1])) {
			System.out.println("data[0]과 data[1]의 주소값이 같음");
		}
		else {
			System.out.println("data[0]과 data[1]의 주소값이 다름");
		}
		if(data[0].equals(data[2])) {
			System.out.println("data[0]과 data[2]의 주소값이 같음");
		}
		else {
			System.out.println("data[0]과 data[2]의 주소값이 다름");
		}

		// 데이터값이 같을 때
		if(data[0].equals(data[1])) {
			System.out.println("data[0]과 data[1]의 데이터값이 같음");
		}
		else {
			System.out.println("data[0]과 data[1]의 주소값이 다름");
		}
		if(data[0].equals(data[2])) {
			System.out.println("data[0]과 data[2]의 데이터값이 같음");
		}
		else {
			System.out.println("data[0]과 data[2]의 주소값이 다름");
		}
		

		// 실습 2
		ColorPoint[] colorData = new ColorPoint[3];
		colorData[0] = new ColorPoint("파랑", 10, 20);
		colorData[1] = new ColorPoint("파랑", 10, 20);
		colorData[2] = new ColorPoint("빨강", 10, 20);

		// 주소값이 같을 때
		if(colorData[0].equals(colorData[1])) {
			System.out.println("colorData[0]과 colorData[1]의 주소값이 같음");
		}
		else {
			System.out.println("colorData[0]과 colorData[1]의 주소값이 다름");
		}
		if(colorData[0].equals(colorData[2])) {
			System.out.println("colorData[0]과 colorData[2]의 주소값이 같음");
		}
		else {
			System.out.println("colorData[0]과 colorData[2]의 주소값이 다름");
		}

		// 데이터값이 같을 때
		if(colorData[0].equals(colorData[1])) {
			System.out.println("colorData[0]과 colorData[1]의 데이터값이 같음");
		}
		else {
			System.out.println("colorData[0]과 colorData[1]의 주소값이 다름");
		}
		if(colorData[0].equals(colorData[2])) {
			System.out.println("colorData[0]과 colorData[2]의 데이터값이 같음");
		}
		else {
			System.out.println("colorData[0]과 colorData[2]의 주소값이 다름");
		}

	}
}
