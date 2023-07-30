package class01;

import java.util.Random;
import java.util.Scanner;

// [ 3 6 9 게임 1, 2번 풀이 ] - day5 파일에 문제있음 

// int num
//  -> 1~1000중에서 랜덤으로 정수 1개 생성
// syso("[num] : ")
// 사용자가 입력을 시도함
//  -> String user
// if(정답상황이라면,)
//     syso("정답")
// else
//     syso("오답")

public class Test03 {
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
		int num=rand.nextInt(1000)+1;
		System.out.print("["+num+"] : ");
		String user=sc.next();

		if(check(num, user)) { // 정답상황이라면,
			System.out.println("정답입니다!");
		}
		else {
			System.out.println("오답입니다.....");
		}

	}
}