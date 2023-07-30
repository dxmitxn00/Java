package class02;

import java.util.Random;

class Home1 {
   String name;
   static int money=10000;
   Home1(String name){
      this.name=name;
   }
   boolean use(int money) {
	   System.out.println(this.name+"님이 "+ money +"원 결제중입니다");
      if(Home1.money<=money) {
         System.out.println(this.name+"님이 과소비중입니다...");
         return false;
      }
      Home1.money-=money;
      // 클래스 변수는 this.를 쓰지 않아서 Home.으로 써주기도 함(확실히 하기 위함)
      return true;
   }
}

public class Answer01 {
   public static void main(String[] args) {

      Home1[] data=new Home1[3];
      data[0]=new Home1("홍길동");
      data[1]=new Home1("애쉬");
      data[2]=new Home1("애니");

      Random rand=new Random();
      int i=0;
      while(true) {
         int randMoney=(rand.nextInt(50)+1)*100;
         if(!data[i++].use(randMoney)) {
            break;
         }
         if(i==data.length) {
            i=0;
         }
      }

      // person은 객체구나~

   }
}