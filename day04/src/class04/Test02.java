package class04;

import java.util.Random;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Random rand=new Random();
		Scanner sc=new Scanner(System.in);

		int N=2; // 상품이 4개란 뜻
		String[] mName=new String[N]; // 메뉴이름 배열
		// 메뉴 이름 입력받아서 배열 초기화
		for(int i=0;i<mName.length;i++) {
			System.out.print((i+1)+"번 상품이름 입력: ");
			mName[i]=sc.nextLine(); // 문자열 입력
			System.out.println(mName[i]+" 상품 저장완료!");
			System.out.println();
		}
		// 메뉴 가격 입력받아서 배열 초기화
		int[] mPrice=new int[N];
		for(int i=0;i<mPrice.length;i++) {
			System.out.print(mName[i]+"의 가격입력: ");
			mPrice[i]=sc.nextInt();
		}
		// 메뉴 재고 입력받아서 배열 초기화
		System.out.println();
		int[] mCnt=new int[N];
		for(int i=0;i<mCnt.length;i++) {
			System.out.print(mName[i]+"의 개수입력: ");
			mCnt[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		/*
      String[] mName=new String[N]; // 메뉴이름 배열
      mName[0]="아메리카노";
      mName[1]="카페라떼";
      mName[2]="아이스티";
      mName[3]="프라푸치노";
      int[] mPrice=new int[N];
      for(int i=0;i<mPrice.length;i++) {
         mPrice[i]=(rand.nextInt(6)+10)*100; // 1000~1500
         // 10~15 x100 : 연산자 우선순위 이슈 체크!
      }
      int[] mCnt=new int[N];
      for(int i=0;i<mCnt.length;i++) {
         mCnt[i]=rand.nextInt(4); // 0~3
      }
		 */

		while(true) {
			System.out.println("1.구매 2.종료");
			System.out.print("입력) ");
			int action=sc.nextInt();
			// 종료
			if(action==2) {
				System.out.println("프로그램 종료...");
				System.out.println();
				break;
			}
			// 유효성 검사
			else if(action<1 || 2<action) {
				System.out.println("유효하지않은 값입니다!");
				System.out.println("다시입력해주세요!");
				continue;
			} 
			int num; // 메뉴 입력 받을 변수
			while(true) {
				System.out.println("=== 메뉴목록 ===");
				for(int i=0;i<mName.length;i++) {
					System.out.print((i+1)+". "+mName[i]+"[");
					if(mCnt[i]==0) {
						System.out.print("재고없음");
					}
					else {
						System.out.print(mCnt[i]);
					}
					System.out.println("]");
				}
				System.out.println("===============");
				System.out.print("번호입력) ");
				num=sc.nextInt();

				// 1~4사이이고, 재고도 있어야함!
				if((1<=num && num<=N) && (mCnt[num-1]>=0)) {
					break;
				}

				if(num<1 || N<num) {
					System.out.println("없는 상품입니다!");
				}
				else if(mCnt[num-1]==0) {
					System.out.println("재고가 없어서 구매가 불가능합니다!");
				}
				
			}
			int cnt;
			while(true) {
				System.out.println("선택한 상품은 "+mName[num-1]+"입니다.");
				System.out.println("가격: "+mPrice[num-1]+"원  재고: "+mCnt[num-1]+"개");
				System.out.print("구매할 개수를 입력) ");
				cnt=sc.nextInt();

				if(0<=cnt && cnt<=mCnt[num-1]) { // 유효성 검사: 입력한 수가 음수이거나 재고보다 많으면 안됨
					break;
				}

				System.out.println("잘못입력하셨습니다.");
				System.out.println("다시 입력해주세요!");
				System.out.println();
			}

			int money;
			int res=mPrice[num-1]*cnt;
			System.out.println("금액: "+res+"원");
			while(true) {
				System.out.print("돈 입력) ");
				money=sc.nextInt();
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

