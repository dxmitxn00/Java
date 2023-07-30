package class04;

public class Test02 {

	public static void main(String[] args) {

		// 1. a=5, b=3
		// 작은수부터 큰수까지 출력
		// 3 4 5

		int a = 5;
		int b = 3;

		if(a > b) { // a를 작은 수로
			int tmp = a;
			a = b;
			b = tmp;
		}

		for(int i=a; i<=b; i++) {

			System.out.print(i + " ");
		}

	}

}
