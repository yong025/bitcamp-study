package com.yong.Day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Board { //test테이블
  Connection CN=null; //DB서버연결정보 서버ip주소 계정id,pwd
  Statement ST=null;  //ST=CN.createStatement()명령어생성 삭제,신규등록,조회하라
  ResultSet RS=null;  //select조회결과값 전체데이터를 기억합니다
  String msg="";
  int Gtotal = 0;  
  Scanner sc = new Scanner(System.in);

  public void dbConnect() {  //생성자로 사용
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클드라이브로드
      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
      System.out.println("오라클 드라이브및 서버연결성공 ");    
      ST = CN.createStatement(); //반드시필수 
    }catch(Exception ex){System.out.println("error =" + ex);}
  }//end

  public void dbInsert() {
    try {
      System.out.println("추가할 코드: ");
      int code = sc.nextInt();

      System.out.println("추가할 이름: ");
      String name = sc.nextLine();

      System.out.println("추가할 제목: ");
      String title = sc.nextLine();

      msg = "insert into test values ( " + code + ", '" + name + "', '" + title + "' )";
      System.out.println(msg);

      int OK = ST.executeUpdate(msg);


    }catch(Exception ex) { }   
  }//end

  public void dbSelectAll() {
    try {
      System.out.println("전체 데이터 출력중입니다 ");
      Thread.sleep(2000);
      ST = CN.createStatement();
      msg ="select  * from  test order by code"; //문자열을 명령어처리 order by code는 순서대로 출력
      ResultSet rs = ST.executeQuery(msg);
      while(rs.next()==true) {
        int a = rs.getInt("code");
        String b = rs.getString("name");
        String c = rs.getString("title");
        System.out.println(a+"\t"+b+"\t" +c);
      }
      rs.close();
    }catch(Exception ex) {System.out.println("전체조회실패 =" + ex); }   
  }//end

  public void dbDelete() {
    try {
      System.out.print("삭제할 이름 ? :");
      String name = sc.nextLine();//nextLine()과의 차이 next는 문자에 공백을 주면 데이터가 분리됨 
      msg = "delete from test where name = " + "' " +name + " '";
      System.out.println(msg);
      ST = CN.createStatement(); //db에서 먼저 선언해서 생략도 가능
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(name + " 삭제되었습니다.");
        dbSelectAll();
      }else {
        System.out.println(name + "삭제 실패입니다.");
      }

      //문자열 msg문자열을 sql명령어 인식 Statement필요
      String msg1 ="insert into ~~";
      String msg2 ="delete where ~~";
      String msg3 ="update 테이블 set where ~~";
      String msg4 ="select ~~"; // 372데이터 조회 = 추출
      //      msg1, msg2, msg3 처리는 ST.executeUpdate(쿼리문장)
      //msg4 처리는 ResultSet RS = ST.executeQuery(쿼리문장)


    }catch(Exception ex) { }      

  }//end

  public void dbupdate() {
    try {
      //수정처리는 대상필드 name,title

      System.out.print("수정할 code 입력  :");
      String code = sc.nextLine(); 
      System.out.print("name 수정내역 입력  :");
      String name = sc.nextLine(); 
      System.out.print("title 수정내역 입력  :");
      String title = sc.nextLine(); 
      //      msg = "update test set code = " + scode +  ", name = '" + name + "' ,title = '" + title + "' where code = " + code  ;
      msg = "update test set name='"+name+"', title='"+title+"'  where code = "+code;

      System.out.println(msg);


      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(code + "데이터 수정 성공");
      }else {
        System.out.println(code + "데이터 수정 실패");
      }
      dbSelectAll();
    }catch(Exception ex) { }    
  }

  public static void main(String[] args) {
    try {   
      Board bbs = new Board();
      bbs.dbConnect(); // 생성자로 Board로도 사용가능
      bbs.dbSelectAll();
      bbs.dbupdate();
      //      bbs.dbDelete();
    }catch(Exception ex){ }
  }//end
}//Board class END

