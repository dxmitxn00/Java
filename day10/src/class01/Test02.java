package class01;

class A{
	int num;
	A(int num){
		this.num = num;
	}
	void printInfo() {
		System.out.println("A: " + this.num);
	}
	@Override
	public boolean equals(Object obj) {

		A a = (A)obj; // 다운캐스팅
		
		if(this.num == a.num) { // 내 숫자와 상대의 숫자가 같아?
			return true;
		}
		return false;
	}
}

class B extends A {
	B(int num) {
		super(num);
	}
}

class C extends A {

	C(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

}

public class Test02 {
	public static void main(String[] args) {

		B b1 = new B(1);
		B b2 = new B(1); // B클래스의 객체들은 1
		B C1 = new B(2); // C클래스의 객체들은 2

		if(b1.equals(b2)) {
			System.out.println("O");
		}
		else {
			System.out.println("X");
		}

	}
}
