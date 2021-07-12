package com.yong.yong0712;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class FreeBoard {

  Connection CN=null; //DB서버연결정보 서버ip주소 계정id,pwd
  Statement ST=null;  //ST=CN.createStatement()명령어생성 삭제,신규등록,조회하라
  ResultSet RS=null;  //select조회결과값 전체데이터를 기억합니다
  String msg="";
  int Gtotal = 0;  
  Scanner sc = new Scanner(System.in);

  public void select() {

    try {
      msg = "select * from freeboard";
      RS = ST.executeQuery(msg);
      System.out.println(msg);

      //      System.out.println("            데이터 출력            ");
      //      System.out.println("\t\t\t\t전체 레코드 갯수:" + Gtotal);
      //      System.out.println("번호\t이름\t제목\t\t날 짜");
      while(RS.next() == true) {
        int num = RS.getInt("num");
        String title = RS.getString("title");
        String contents = RS.getString("contents");
        String reply = RS.getString("reply");
        Date date  = RS.getDate("written");
        String id = RS.getString("id");
        int view = RS.getInt("viewcount");
        System.out.println(num + "\t" + title + "\t" + contents + "\t" + reply + "\t" + date + "\t" + id + "\t" + view);
      }
    }catch (Exception e) { System.out.println("에러이유" + e); }    
  }

  //    DBbase();
  public void insert() {
    try {
      //첫 번째 명령어 생성 
      ST = CN.createStatement();

      //키보드에서 데이터 입력
      System.out.print("\n번호입력 : ");
      int num = Integer.parseInt(sc.nextLine());
      System.out.print("제목입력 : ");
      String title = sc.nextLine();
      System.out.println("내용입력: ");
      String contents = sc.nextLine();
      System.out.print("ID입력 : ");
      String id = sc.nextLine();
      int view = 0;
      //
      //                                            values(1,'첫게시글','첫 게시글입니다.', sysdate, 'yong1',1);
      msg = "insert into freeboard (num,title,contents,written,id,viewcount) values(" + num + ",'" + title + "' ,'" + contents + "','" + id + "',"+ view + ")";
      //      msg="insert into notice(num,name,title,wdate) values("+a+", '"+b+"', '"+c+"' )";
      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println("'"+title + "' 게시글 저장성공했습니다.");
      } else {System.out.println("'"+title + "' 게시글 저장실패했습니다.");}
    }catch (Exception e) { } 
  }
}


