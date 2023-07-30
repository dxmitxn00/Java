package class02;

import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		int N = 4; // 메뉴 개수
		String mName[] = new String[N]; // 메뉴 배열
		mName[0] = "아메리카노";
		mName[1] = "카페라떼";
		mName[2] = "카푸치노";
		mName[3] = "아이스티";
		int mPrice[] = new int[N]; // 가격 배열
		int mCnt[] = new int[N]; // 재고 배열
		int mmm = 0;

		// 가격 랜덤 설정
		while(true) {for(int i=0; i<mPrice.length; i++) {
			mmm = rand.nextInt(4500)+1;
			if(mmm%500==0) {
				mPrice[i] = mmm;
			}
			break;
		}
		// 재고 랜덤 설정
		for(int i=0; i<mCnt.length; i++) {
			mCnt[i] = rand.nextInt(3)+1;
		}
		// 프로그램 실행
		while(true) {
			while(true) {
				// 출력
				System.out.println("1.구매 2.종료");
				System.out.println("번호를 입력해주세요: ");

				int action = sc.nextInt();

				// 종료
				if(action==2) {
					System.out.println("이용해주셔서 감사합니다!");
					break;}

				// 유효성 검사
				if(action<1 || action>2) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println("다시 입력하세요!");
					System.out.println();
					continue;
				}


			}
			// 구매
			while(true) {
				System.out.println("==== 메뉴판 ====");

				for(int i=0; i<mName.length; i++) {
					if(mCnt[i]==0) {
						System.out.println(mName[i]+"[재고없음]");
					}
					else {
						System.out.println(mName[i]+"["+mCnt[i]+"]");
					}
				}
				break;

			}

		}


		}
	}
}
