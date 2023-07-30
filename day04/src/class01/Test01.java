package class01;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	//[ 자판기 프로그램 ]
	// 어디에 어떤 방식으로 '유효성 검사'가 들어가야 하나
	// 총 몇 개가 들어가야 하나 ==> 4개
	//	: 유효성 검사는 '입력할 때 마다' 진행됨
	//	1) 잘못된 입력을 한 사용자에게 안내 -> 올바른 입력을 알려주면 더 좋음
	//	2) 프로그램의 강제 종료를 예방
	public static void main(String[] args) {

		// 1. 구매하기 / 종료하기
		// 2-1. 종료하기 : 프로그램 종료
		// 2-2. 구매하기 : 아메리카노 / 카페라떼 / 아이스티 등의 메뉴 출력
		// 3. 몇 개 구매?
		// 4. 가격 안내
		// 5. 현금 입력 -> 거스름돈 반환
		// !!! 재고 데이터 존재함



		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		// 유지보수 : 메뉴의 개수가 바뀌었을 때 수정 편하도록 메뉴 개수 변수 따로 선언
		int N = 3; // 메뉴의 개수
		String[] mName = new String[N]; // 메뉴 이름 배열
		mName[0]="아메리카노";
		mName[1]="카페라떼";
		mName[2]="아이스티";
		// 가로로 나열한 배열 초기화는 실무에서 잘 안씀
		// 가독성을 위해 인덱스 별로 초기화 해줌
		int[] mPrice = new int[N];
		mPrice[0]=2500;
		mPrice[0]=3500;
		mPrice[0]=3000;
		int[] mCnt = new int[N]; // 재고 개수
		for(int i=0;i<mCnt.length;i++) {
			mCnt[i] = rand.nextInt(3)+1;
		}

		while(true) { // 몇 번 반복할 지 모르기 때문

			// 1. 출력
			System.out.println("1.구매 2.종료");
			System.out.println("입력) ");
			int action = sc.nextInt();

			// 2-1. 종료
			if(action==2) { 
				System.out.println("이용해주셔서 감사합니다!");
				break; // 무한루프면 종료조건이 필요함
			}
			else if(!(action<1 || 2<action)) { // 유효성 검사 : 1미만 2초과일 때
				System.out.println("잘못된 입력 값입니다.");
				System.out.println("확인 후 다시 이용해주세요!");
				continue; // 다시 번호 입력을 하게 하기 위함
			}
			// else를 안써도 되는 상황에서 쓰면 코드 깊이가 깊어져 가독성 떨어짐,
			// 웬만하면 쓰지 말

			// 2-2. 구매
			int num=sc.nextInt();
			while(true) { // 유효성 검사: 메뉴 입력 유효성 검사 후 다시 메뉴판으로 오려면 while문에 넣어줘야 함
				System.out.println("==== 메뉴판 ====");
				for(int i=0;i<mName.length;i++) {
					System.out.println((i+1)+". "+mName[i]);
				}

				System.out.println("=========================");

				System.out.println("구매할 상품의 번호를 입력");
				// num(지역)번수는 67라인의 while블록 안 선언되면
				// 91번의 블록을 벗어나면 소멸되기 때문에
				// 블록문 바깥으로 빼서 선언해주어야 한다.
				
				

				if(1<=num && num<=N) { // 종료조건 : 제대로 입력했다면
					break;
				}

				/*
				if(num<1 || N<num) {
					System.out.println("없는 상품번호입니다.");
					System.out.println("다시 입력해주세요!");
					System.out.println();
				}
				 */

				System.out.println("없는 상품번호입니다.");
				System.out.println("다시 입력해주세요!");
				System.out.println();
			}

			// num--; 출력할 때 하나하나 num-1 안해주고 이렇게 해줘도 됨

			int cnt = sc.nextInt();
			while(true) {
				System.out.println("선택한 상품은 "+mName[num-1]+"입니다.");
				System.out.println("가격: "+mPrice[num-1]+"원  재고: "+mCnt[num-1]+"개");
				System.out.print("구매할 개수를 입력) ");

				if(0<=cnt && cnt<=mCnt[num-1]) { // 유효성 검사: 입력한 수가 음수이거나 재고보다 많으면 안됨
					break;
				}

				System.out.println("잘못입력하셨습니다.");
				System.out.println("다시 입력해주세요!");
				System.out.println();
			}

			int money = sc.nextInt();
			int res=mPrice[num-1]*cnt;
			System.out.println("금액: "+res+"원");
			while(true) {
				System.out.print("돈 입력) ");
				if(res<=money) {
					break;
				}
				System.out.println("잘못입력하셨습니다.");
				System.out.println("다시 입력해주세요!");
				System.out.println();
			}

			res=money-res; // 거스름돈 계산을 위한 변수
			if(res!=0) {
				System.out.println("거스름돈 "+res+"원 반환 완료!");
			}
			System.out.println("구매 성공!");
			System.out.println();

			mCnt[num-1]-=cnt; // "장바구니 이슈"를 생각해볼것!

		}

	}


}

