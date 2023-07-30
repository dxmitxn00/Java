package class04;

public class Test03 {

	public static void main(String[] args) {

		// 2. a=1, b=10
		// 작은수부터 큰수까지 홀수만 출력
		// 1 3 5 7 9

		int a = 10;
		int b = 1;

		if(a > b) { // a를 작은 수로
			int tmp = a;
			a = b;
			b = tmp;
		}
		
		// 1. 홀수일 때 출력해
		for(int i=a; i<=b; i+=2) {
			
			if(a % 2 != 1) { // 홀짝 비교
				i++;
			}
			
			System.out.print(i + " ");
		}
		
		System.out.print("\n");
		
		// 2. 짝수일 때 출력하지마
		for(int i=a; i<=b; i++) {
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}

	}

}
