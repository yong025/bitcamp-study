package com.yong.yong0712;

import java.sql.SQLException;
import java.util.Scanner;

public class Login2 extends DB{

  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) throws SQLException {
    Login2 lg = new Login2();
    lg.member();
  }

  public void member() throws SQLException {
    DBbase();
    System.out.print("id입력: ");
    String id = sc.nextLine();
    System.out.print("password입력: ");
    String password =sc.nextLine();

    String crt = "select count(id) as cnt from id where id = '" + id +  "' and pwd = '" + password + "'";
    //id와 pwd입력값이 데이터베이스와 일치하면 id의 갯수를 카운트한다. 변수 crt에 저장
    RS = ST.executeQuery(crt);
    //쿼리에 변수 crt를 입력
    if (RS.next() == true) {
      int cnt = RS.getInt("cnt");
      // 임시로 설정된 cnt필드의 값을 int cnt에 저장한다.
      // 값이 일치하는 경우 : 1
      // 값이 일치하지 않는 경우 : 0
      if(cnt > 0) { // id,pw 일치하는경우
        String grd = "select grade from id where id = '" + id + "'" ;//입력값 id가 포함된 쿼리문을 변수grd에 입력
        RS = ST.executeQuery(grd);
        //변수 grd를 데이터베이스 변수 RS에 입력한다.
        while(RS.next() == true) {
          int grade = RS.getInt("grade");// id필드 데이터에에 종속되어 있는 grade필드 데이터를 int변수로 저장 
          System.out.println(id + "님의 회원 등급은 " + grade + "번 입니다.");

          switch (grade) {
            case 4:

              System.out.println(grade + "번 등급 기능 : 삭제가능");
            case 3:
              System.out.println(grade + "번 등급 기능 : 수정가능");
            case 2:
              System.out.println(grade + "번 등급 기능 : 생성가능");
            case 1:
              System.out.println(grade + "번 등급 기능 : 조회가능");
            default:
              break;
          }
        }
      } else { // id, pw 일치하지 않는 경우
        System.out.println("비밀번호가 맞지 않습니다.");
      }
    }
  }
}


