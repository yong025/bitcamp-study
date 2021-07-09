package com.yong.Day0707;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DBTest {
  Connection CN = null; //DB서버연결정보 : ip주소, 계정id와 pw 등 기억
  Statement ST = null; //명령어 생성 : 삭제, 신규등록, 조회 등 명령내림
  ResultSet RS = null; //Select조회결과를 기억 (덩어리)
  String msg = "isud = crud 쿼리기술문";    
  int Gtotal = 0;  
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    DBTest db = new DBTest();
    db.DB();
    int sel = 3;
    try {
      while(true) {

        System.out.print("\n1.insert 2.delete 3.update 4.select 5.종료 ");
        sel = Integer.parseInt(db.sc.nextLine());

        switch(sel) {

          case 1 : db.Insert(); break;
          case 2 : db.Delete(); break;
          case 3 : 
          case 4 : db.Select(); break;
          case 5 : 
            System.out.println("프로그램을 종료합니다.");
            System.exit(1);
          default :
            System.out.println("잘못 입력하셨습니다.");
            break;
        }//switch end
      }//while end
    }catch (Exception e) { }
    db.sc.close();
  }//main close

  public void Insert () {

    try {
      //첫 번째 명령어 생성 
      ST = CN.createStatement();

      //키보드에서 데이터 입력
      System.out.print("\n코드입력(4자리) : ");
      int a = Integer.parseInt(sc.nextLine());
      System.out.print("이름입력 : ");
      String b = sc.nextLine();
      System.out.print("제목입력 : ");
      String c = sc.nextLine();

      //3번째 쿼리문 완성
      //      msg = "insert into test (code,name,wdate,cnt) values(a,'b', 'c', sysdate, 0)";
      msg="insert into test(code,name,title,wdate,cnt) values("+a+", '"+b+"', '"+c+"', sysdate, 0)";
      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(a + "코드 데이터 저장성공했습니다.");
      } else {System.out.println(a + "코드 데이터 저장실패했습니다.");}
    }catch (Exception e) { }  
  }//end


  public void Select() {
    try {
      /////////////////////////////////////////////////////////////////////
      msg = "select count(*) as hit from test";
      RS = ST.executeQuery(msg);
      if( RS.next() == true) {
        Gtotal = RS.getInt("hit");
      }
      //////////////////////////////////////////////////////////////////////

      System.out.println("프로그램 데이터 불러오는중 ");
      Thread.sleep(3000);
      msg = "select * from test";
      RS = ST.executeQuery(msg);

      System.out.println("----------데이터 출력-------------");
      System.out.println("\t\t\t\t전체 레코드 갯수:" + Gtotal);
      System.out.println("코드\t이름\t제목\t날 짜\t\t조회수");
      while(RS.next() == true) {
        //
        int ucode = RS.getInt("code");
        String uname = RS.getString("name");
        java.util.Date udt = RS.getDate("wdate");
        String utitle = RS.getString("title");
        int ucnt = RS.getInt("cnt");
        System.out.println(ucode + "\t" + uname + "\t" + utitle + "\t" + ucnt);
      }
    }catch (Exception e) { System.out.println("에러이유" + e); }    
  }

  public void DB () {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클드라이브로드
      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
      CN = DriverManager.getConnection(url, "system", "1234");
      System.out.println("오라클드라이버 및 서버 계정 비번 연결성공 10:11");
    }catch (Exception e) {System.out.println("에러이유" + e);}
  }

  public void Delete() {
    try {
      System.out.println("\n삭제할 코드 입력 : ");
      int a = Integer.parseInt(sc.nextLine());

      msg = "delete from test where code = " + a ;
      System.out.println(msg);
      int aa = ST.executeUpdate(msg);

      if (aa>0) {
        System.out.println(a + "코드 데이터 삭제");
      } else {System.out.println(a + "코드 데이터 삭제실패했습니다.");}

    }catch (Exception e) {System.out.println("에러이유" + e);}
  }//delete end

  public void update () {
    try {
      System.out.println("\n수정할 코드번호 : ");
      int a = Integer.parseInt(sc.nextLine());

      System.out.println("\n수정할 코드 내용 : ");
      int b = Integer.parseInt(sc.nextLine());

      msg = "update test set code = " + b + " where " + a ;
      System.out.println(msg);
      int aa = ST.executeUpdate(msg);

      if (aa>0) {
        System.out.println(a + "코드 데이터 수정");
      } else {System.out.println(a + "코드 데이터 수정 실패했습니다.");}

    }catch (Exception e) {System.out.println("에러이유" + e);}
  }
}//class close


//public class DBTest {
//  public static void main(String[] args) {
//    Connection CN=null; //DB서버연결정보 서버ip주소 계정id,pwd
//    Statement ST=null;  //ST=CN.createStatement()명령어생성 삭제,신규등록,조회하라
//    ResultSet RS=null;  //select조회결과값 전체데이터를 기억합니다
//    String msg="isud=crud쿼리문기술";
//    int Gtotal = 0;  
//    Scanner sc = new Scanner(System.in);
//
//    try {   
//      Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클드라이브로드
//      String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE" ;
//      CN=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
//      //System.out.println("오라클 드라이브및 서버연결성공 ");
//
//      //첫번째명령어생성
//      ST = CN.createStatement();
//      /////////////////////////////////////////////////////////////////
//      msg ="select count(*) as hit  from test ";
//      RS = ST.executeQuery(msg);
//      if( RS.next()==true) { Gtotal = RS.getInt("hit"); }
//      /////////////////////////////////////////////////////////////////
//
//      System.out.println("프로그램 전체데이터 읽어오는중입니다");
//      Thread.sleep(1000);
//      msg = "select * from  test " ; //문자열을 명령어 인식해서 실행하도록 Statement
//      RS = ST.executeQuery(msg);
//
//      System.out.println("------------- 데이터 출력 ----------------");
//      System.out.println("\t\t\t    전체레코드갯수:" + Gtotal);
//      System.out.println("코 드\t이 름\t제 목\t날 짜\t   조회수");
//      while(RS.next()==true) {
//        //필드접근해서 데이터가져올때 getXXX()
//        int ucode = RS.getInt("code");
//        String uname = RS.getString("name");
//        java.util.Date udt = RS.getDate("wdate");
//        String utitle = RS.getString("title");
//        int ucnt = RS.getInt("cnt");
//        System.out.println(ucode +"\t" + uname+"\t" + utitle+"\t" + udt+"\t" + ucnt);
//      }//while end
//
//      //      System.out.println("프로그램 전체데이터 읽어오는중입니다");
//      //      Thread.sleep(1000);
//      //삭제처리 넣기 msg = "delete from test where code"
//    }catch(Exception ex) { System.out.println("에러이유 " + ex);}   
//    sc.close();
//  }//main end
//
//  //신규등록,전체출력성공후 메소드생성해서 최대한 메소드활용    
//  //본인작성한 코드는 복사후 붙여넣기 주석처리 
//
//}//class END

