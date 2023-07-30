package class04;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
   public static void main(String[] args) {
      Random rand=new Random();
      Scanner sc=new Scanner(System.in);

      int N=2; // 상품이 2개란 뜻
      String[] mName=new String[N]; // 메뉴이름 배열
      int index=0;
      while(true) {
         if(index==N) {
            break;
         }
         
         System.out.print((index+1)+"번 상품이름 입력: ");
         mName[index]=sc.nextLine(); // 문자열 입력         
         System.out.println(mName[index]+"이(가) 맞나요?");
         System.out.print("1-YES 2-NO : ");
         int ans=sc.nextInt();
         sc.nextLine(); // 버퍼에 남아있는 쓸데없는값들을 치워주는 코드
         
         if(ans!=1) {
            System.out.println("다시 입력해주세요!");
            continue;
         }
         
         System.out.println();
         
         index++;
      }
      int[] mPrice=new int[N];
      for(int i=0;i<mPrice.length;i++) {
         System.out.print(mName[i]+"의 가격입력: ");
         mPrice[i]=sc.nextInt();
      }
      System.out.println();
      int[] mCnt=new int[N];
      for(int i=0;i<mCnt.length;i++) {
         System.out.print(mName[i]+"의 개수입력: ");
         mCnt[i]=sc.nextInt();
      }
      System.out.println();
      System.out.println();
      System.out.println();
   }
}