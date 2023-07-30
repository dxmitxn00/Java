package class04;

// 클래스
class Book1{
   // 멤버변수
   String title;
   int price;
   int cnt;
   
   Book1(String t,int p){
      title=t;
      price=p;
      cnt=0;
      System.out.println(title+" 생성완료!");
   }
   Book1(String t,int p,int c){
      title=t;
      price=p;
      cnt=c;
      System.out.println(title+" 생성완료!");
   }
   
   // 메서드
   void printInfo() {
      System.out.println(title+" 판매량: "+cnt);
   }
   void sell() {
      cnt+=10;
      System.out.println(title+" 판매완료");
   }
}

public class PracticeTest02 {
   public static void main(String[] args) {

      // 객체들
      Book1 b1=new Book1("어린왕자",7800); // 선언하지않아도 기본적으로 제공되는 생성자
      Book1 b2=new Book1("해리포터",23000); // 기본(디폴트)생성자 : 인자없음
      // 생성자(함수)
      // 1. 클래스와 이름이 같고
      // 2. 객체를 생성할수있으며
      // 3. new 연산자와 함께 사용
      
      b1.printInfo();
      b2.printInfo();
      
      // 15~23라인까지 함수는 총 4개
      // 함수 1개
      // 메서드 1개
      // 생성자 2개
      
      Book1 b3=new Book1("비전공자를 위한 이해할 수 있는 IT지식",16800,100);
      
      b3.sell();
      b3.printInfo();
      
      
      
      
      
   }
}