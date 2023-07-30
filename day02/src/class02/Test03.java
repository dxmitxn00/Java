package class02;

// 한 소스코드 내에서
// 유사한 코드가 없도록 작성
class Test03 {

	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		int min; // 작은 수
		int max; // 큰 수

		// 교환 알고리즘
		if(a > b) {
			int tmp = a; // 임시저장변수
			a = b;
			b = tmp;
		}
		
		while(a >= b) {

			System.out.print(a + " ");
			b++;

		}
	}
}
//		if(a > b) { // a와 b 크기 비교
//			min = b;
//			max = a;
//		}
//		else {
//			min = a;
//			max = b;
//		}
//
//		while(min <= max) {
//
//			System.out.print(min + " ");
//			min++;
//
//		}
//
//
//	}
//
//}

/*
연습문제)
a = 5, b = 9
56789라고 출력

a = -5, b = -3
-5 -4 -3 출력

a = 2, b = 2
2 만 출력

심화 > a = 3, b = 1
	1 2 3 오름차순 출력
 */
