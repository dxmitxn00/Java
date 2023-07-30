package client;

import controller.StudentCtrl;

public class Client {

   public static void main(String[] args) {

      StudentCtrl app=new StudentCtrl(); // 컨트롤러 객체화가 제일 먼저 실행됨
      app.startApp();
      
      
   }

}