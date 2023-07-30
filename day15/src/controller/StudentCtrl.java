package controller;

import java.util.ArrayList;

import model.StudentDAO;
import model.StudentVO;
import view.StudentView;

public class StudentCtrl {

   private StudentView view;
   private StudentDAO dao; // model을 DAO로 부름
   
   public StudentCtrl() {
      this.view = new StudentView();
      this.dao = new StudentDAO();
   }
   
   public void startApp() { 
      while(true) {
         // 사용자한테 메뉴 보여줘 !
         // 사용자가 뭐 할지 입력 받아봐
         
         view.printMenu();
         int menuNum = view.getMenuNum();
         
         if(menuNum == 1) { // 1번이면 , 목록 출력
            
            ArrayList<StudentVO> datas = dao.selectAll();
            view.printStudentList(datas);
            
         } else if(menuNum == 2) { // 2번이면 , 1명 출력해
            
            int num = view.getStudentNum();
            StudentVO data = dao.selectOne(num);
            view.printStudent(data);
            
         } else if(menuNum == 3) { // 3번이면, 정보 변경해
            
            int num = view.getStudentNum();
            int score = view.getStudentScore();
            dao.update(num, score);
            view.printInfo();
            
         }else if(menuNum==4) {
             // 추가해
            view.printInfo_C_START();
             String name=view.getStudentName();
             int score=view.getStudentScore();
             dao.insert(name, score);
             view.printInfo_C_END();
          }
         else if(menuNum==5) {
             // 제거해
            view.printInfo_D_START();
             int num=view.getStudentNum();
             dao.delete(num);
             view.printInfo_D_END();
          }
         else if(menuNum==6) {
             view.printEnd();
             break;
          }
      }
   }
   
   
}