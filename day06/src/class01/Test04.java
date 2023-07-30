package class01;

import java.util.Random;
import java.util.Scanner;

// [ 3 6 9 게임 1, 2번 풀이 ] - day5 파일에 문제있음 

// while(최대 3번)
//	[1]
//	if(오답이라면) -> 종료조건
//		break;
//
// for(3번 다 정답)
//	이름입력
//	입력받은 이름 출력

public class Test04 {
	public static boolean check(int num,String user) {
		final int NUM=num;
		int cnt=0; // 박수의 개수

		int x=1000;
		while(x>0) {
			int n=num/x;
			if(n==3 || n==6 || n==9) {
				cnt++;
			}

			num=num%x; // 1234 -> 234
			x=x/10;
		}

		String ans="";
		for(int i=0;i<cnt;i++) {
			ans+="짝";
		}
		if(cnt==0) {
			ans=Integer.toString(NUM);
		}

		System.out.println("ans: "+ans);
		System.out.println("user: "+user);

		if(ans.equals(user)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Random rand=new Random();

		final int LV=1;
		int i=0;
		while(i<LV) {
			int num=rand.nextInt(1000)+1;
			System.out.print("["+num+"] : ");
			String user=sc.next();

			if(!check(num, user)) { // 오답상황이라면,
				System.out.println("오답입니다.....");
				break;
			}
			else {
				System.out.println("정답입니다!");
				i++;
			}
			if(i==LV) {
				System.out.println("이름 입력: ");
				String name=sc.next();
				System.out.println(name+"님 축하드립니다.");
			}
		}

	}
}
