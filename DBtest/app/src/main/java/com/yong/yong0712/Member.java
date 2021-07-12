package com.yong.yong0712;


import java.util.Scanner;

public class Member {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DB fb = new DB();
    id id = new id();


    fb.DBbase();
    try {
      while(true) {

        id.select();
        System.out.println("1.회원 가입 2.로그인 3.회원 탈퇴 4.종료 ");
        System.out.print("입력 :");
        int level = Integer.parseInt(sc.nextLine());
        switch(level) {
          case 1 : id.insert(); break;
          case 2 : id.login(); break;
          case 3 : id.Delete(); break;
          case 4 : 
            System.out.println("종료합니다.");
            System.exit(0);
          default :
            System.out.println("잘못 입력하셨습니다.");
            break;
        }//switch end
      }//while end
    }catch (Exception e) { }
  }  


}


