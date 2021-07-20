package com.yong.yong0712;

import java.util.Date;
import java.util.Scanner;

public class Review extends DB {

  String msg = "isud = crud 쿼리기술문";    
  int Gtotal = 0;  
  Scanner sc = new Scanner(System.in);

  //  public void choice() {
  //    loop: while(true) {
  //      select();
  //      System.out.print("\n1.게시글 추가 2.게시글 수정 3.게시글 삭제 4.게시글조회 5.back");
  //      System.out.print("\n입력 :");
  //      int k = Integer.parseInt(sc.nextLine());
  //
  //      switch (k) {
  //        case 1: insert(); break;
  //        case 2: update(); break;
  //        case 3: Delete(); break;
  //        case 4: select(); break;
  //        case 5: break loop;
  //        default:
  //          System.out.println("지원하지 않는 명령입니다.");
  //      } 
  //    }
  //  }

  public void select() {
    DBbase();
    try {
      msg = "select * from review";
      RS = ST.executeQuery(msg);
      System.out.println(msg);


      for(int i = 0; i<10 && RS.next() == true ; i++) {
        int num = RS.getInt("num");
        String title = RS.getString("title");
        String contents = RS.getString("contents");
        String reply = RS.getString("reply");
        int recommended = RS.getInt("recommended");
        Date written  = RS.getDate("written");
        String id = RS.getString("id");
        int viewcount = RS.getInt("viewcount");
        System.out.println( num + "\t" + title + "\t" + reply + "\t" + recommended + "\t" + written + "\t" + id + "\t" + viewcount);
      }

      System.out.println("게시글 번호 입력: ");
      String a = sc.nextLine();
      String msg = "select contents from review where num= '" + a + "'" ;
      RS = ST.executeQuery(msg);
      while(RS.next()==true) {
        String contents = RS.getString("contents");
        System.out.println(contents);
      }

    }catch (Exception e) { System.out.println("에러이유" + e); }    
  }



  public void insert() {
    DBbase();

    try {
      //첫 번째 명령어 생성 
      ST = CN.createStatement();

      //키보드에서 데이터 입력
      System.out.print("\n제목 입력 : ");
      String a = sc.nextLine();
      System.out.print("내용 입력 : ");
      String b = sc.nextLine();
      System.out.print("id 입력 : ");
      String c = sc.nextLine();

      msg = "insert into review(num,title,contents,recommended,written,id) values(seq.nextval,'" + a + "', '" + b + "',0, sysdate,'" + c + "')";

      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(a + "게시글 저장성공했습니다.");
      } else {System.out.println(a + "게시글 저장실패했습니다.");}
    }catch (Exception e) { } 
  }

  public void update () {
    //    DBbase();
    try {
      //수정처리는 대상필드 name,title

      System.out.print("수정할 게시물 제목 입력  :");
      String title = sc.nextLine(); 
      System.out.print("제목 수정내역 입력  :");
      String updatetitle= sc.nextLine(); 
      System.out.print("내용 수정내역 입력  :");
      String contents = sc.nextLine();

      msg = "update review set title='" + updatetitle +"', contents='"+ contents +"'  where  = '"+ title + "'";

      System.out.println(msg);


      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println( "게시글 수정 성공");
      }else {
        System.out.println( "게시글 수정 실패");
      }
      select();
    }catch(Exception ex) { }    
  }
  public void Delete() {
    //    DBbase();
    try {
      System.out.println("\n삭제할 게시글 번호 입력 : ");
      int a = Integer.parseInt(sc.nextLine());

      msg = "delete from review where title = aa and grade  = 3" + a ;
      System.out.println(msg);
      int aa = ST.executeUpdate(msg);

      if (aa>0) {
        System.out.println(a + "게시글 삭제");
      } else {System.out.println(a + "게시글 삭제실패했습니다.");}

    }catch (Exception e) {System.out.println("에러이유" + e);}
  }//delete end
}
