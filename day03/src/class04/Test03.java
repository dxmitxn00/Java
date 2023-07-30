package class04;

import java.util.Scanner; // 단축키: command+shift+O

public class Test03 {

	public static void main(String[] args) {

		// 자판기(키오스크)
		String[] mName=new String[3];
		mName[0]="아메리카노";
		mName[1]="카푸치노";
		mName[2]="아이스티";
		
		int[] mPrice=new int[3];
		mPrice[0]=2500;
		mPrice[1]=4500;
		mPrice[2]=3000;
		
		int[] mCnt=new int[3];
		mCnt[0]=100;
		mCnt[1]=10;
		mCnt[2]=2;
		
		Scanner sc=new Scanner(System.in);
		
		
		while(true) { // 종료조건을 일부러 만들지 않음(키오스크는 억지로 끄지 않으면 안꺼짐)
		
			System.out.println("====== 메뉴판 ======");
			for(String v:mName) {
				System.out.println(v);
			}
			System.out.println("==================\n");
			
			// 사용자의 편의성 고려해서 코딩
			System.out.print("메뉴를 입력하세요: ");
			int uNum=sc.nextInt(); // 아메리카노
			int uCnt=3; // 몇 개 구매할 지
			
			if(uCnt>mCnt[uNum-1]) {
				System.out.println("재고가 부족합니다.");
				break;
			}
			
			System.out.println(mName[uNum-1]+"메뉴를 "+uCnt+"개 구매했습니다.");
			System.out.println("총 금액: "+uCnt*mPrice[uNum-1]);
			mCnt[uNum-1]-=uCnt;
		}
		
		
		
	}

}
