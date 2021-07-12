package com.yong.yong0712;

import java.sql.SQLException;
import java.util.Scanner;

public class Login extends DB{

  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws SQLException {
    Login lg = new Login();
    lg.member();
  }

  public void member() throws SQLException {
    DBbase();
    System.out.print("id입력: ");
    String id = sc.nextLine();
    System.out.print("password입력: ");
    String password =sc.nextLine();

    String msg = "select grade from id where id = '" + id + "'" ;
    //    String msg2 = "select grade from id where password = '" + password + "'" ;
    RS = ST.executeQuery(msg);
    //    RS2 = ST2.executeQuery(msg2);
    //    RS2 = ST.executeQuery(msg2);


    //    if(msg &&msg2) {

    while (RS.next() == true) {
      int grade = RS.getInt("grade");
      System.out.println("등급은 " + grade + "번 등급 입니다.");

      switch (grade) {
        case 4:
          System.out.println("삭제가능");
        case 3:
          System.out.println("수정가능");
        case 2:
          System.out.println("생성가능");
        case 1:
          System.out.println("조회가능");
        default:
          break;
      }
    }
    //    } else { System.out.println("아이디 비밀번호가 맞지 않습니다.");}
  }
}


