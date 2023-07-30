package class06;

public class Test02 {

	public static void func(int a) {
		a=100;
		System.out.println("func()입니다. a="+a);
	}
	
	public static void main(String[] args) {
		int a=10;
		System.out.println("a="+a);
		func(a);
		System.out.println("a="+a);
		func(++a);
		System.out.println("a="+a);
	}

}
/*
console)
a=10
func()입니다. a=100
a=10
func()입니다. a=100
a=11 -> main에 있는 변수가 중요함 => 함수는 호출될 때마다 메모리가 생기며
								함수 실행이 끝나면 메모리가 사라짐
*/