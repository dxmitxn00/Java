package class02;

class Point1{
   int x;
   int y;
   Point1(int x,int y){
      this.x=x;
      this.y=y;
   }
   void printInfo() {
      System.out.println("("+this.x+","+this.y+")");
   }
   @Override
   public boolean equals(Object obj) {
      Point1 point=(Point1)obj;
      if(this.x==point.x) {
         if(this.y==point.y) {
            return true;
         }
      }
      return false;
   }
}
class ColorPoint1 extends Point1{
   String color;
   ColorPoint1(String color,int x,int y){
      super(x,y);
      this.color=color;
   }
   @Override
   public boolean equals(Object obj) {
      ColorPoint1 colorPoint = (ColorPoint1)obj;
      if((this.x==colorPoint.x)&&(this.y==colorPoint.y)&&(this.color.equals(colorPoint.color))) {
         return true;
      }
      return false;
   }   
}
public class Answer01 {
   public static void main(String[] args) {      
      Point1[] data=new Point1[3];
      data[0]=new Point1(10,20);
      data[1]=new Point1(123,20);
      data[2]=new Point1(10,20);
      for(int i=1;i<=2;i++) {
         if(data[0].equals(data[i])) {
            System.out.println("같아~");
         }
         else {
            System.out.println("달라~");
         }
      }
      ColorPoint1[] data2=new ColorPoint1[3];
      data2[0]=new ColorPoint1("파랑",10,20);
      data2[1]=new ColorPoint1("파랑",10,20);
      data2[2]=new ColorPoint1("빨강",10,20);
      for(int i=1;i<=2;i++) {
         if(data2[0].equals(data2[i])) {
            System.out.println("같아~");
         }
         else {
            System.out.println("달라~");
         }
      }
   }
}