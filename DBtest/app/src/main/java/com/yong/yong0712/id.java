package com.yong.yong0712;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class id  extends DB {

  String msg="";
  int Gtotal = 0;  
  Scanner sc = new Scanner(System.in);

  public void select() {
    DBbase();
    try {
      msg = "select * from id";
      RS = ST.executeQuery(msg);
      System.out.println(msg);

      //      System.out.println("            데이터 출력            ");
      //      System.out.println("\t\t\t\t전체 레코드 갯수:" + Gtotal);
      //      System.out.println("번호\t이름\t제목\t\t날 짜");
      while(RS.next() == true) {
        String id = RS.getString("id");
        int grade = RS.getInt("grade");
        String pwd = RS.getString("pwd");
        String name = RS.getString("name");
        String email = RS.getString("email");
        String mobile = RS.getString("mobile");
        Date date  = RS.getDate("written");
        int recommended = RS.getInt("recommended");
        String belongs = RS.getString("belongs");
        System.out.println(id + "\t" + grade + "\t" + pwd + "\t" + name+ "\t" + email+ "\t" + mobile+ "\t" + date+ "\t" + recommended+ "\t" + belongs);
      }
    }catch (Exception e) { System.out.println("에러이유" + e); }    
  }


  public void login() throws SQLException {
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

  public void insert() {
    DBbase();
    try {
      //첫 번째 명령어 생성 
      ST = CN.createStatement();

      //키보드에서 데이터 입력
      System.out.print("\nID입력 : ");
      String id = sc.nextLine();
      System.out.print("grade : ");
      int grade = Integer.parseInt(sc.nextLine());
      System.out.print("비밀번호입력 : ");
      String pwd = sc.nextLine();
      System.out.print("이름입력 : ");
      String name = sc.nextLine();
      System.out.print("email입력 : ");
      String email = sc.nextLine();
      System.out.print("mobile입력 : ");
      String mobile = sc.nextLine();
      System.out.print("소속입력 : ");
      String belongs = sc.nextLine();

      msg = "insert into id(id,grade,pwd,name,email,mobile,written,belongs) values('" + id + "', "+ grade + ",'" + pwd + "', '"+ name +"','" + email + "','" + mobile + "', sysdate ,'" + belongs + "')";

      System.out.println(msg);
      int OK = ST.executeUpdate(msg);
      if (OK>0) {
        System.out.println(id + "회원가입 성공했습니다.");
      } else {System.out.println(id + "회원가입 실패했습니다.");}
    }catch (Exception e) { } 
  }
  public void Delete() {
    DBbase();
    try {
      System.out.print("\n삭제할 ID 입력 : ");
      String id = sc.nextLine();
      System.out.print("\npassword 입력 : ");
      String password = sc.nextLine();
      System.out.print("정말 탈퇴하시겠습니까 ? [y / N]");

      if(!sc.nextLine().equals("y")) {
        System.out.println("회원 탈퇴 취소하셨습니다.");
      } else {
        msg = "delete from id where id = '" + id + "' and pwd = '" + password + "'" ;
        int aa = ST.executeUpdate(msg);
        if (aa>0) {
          System.out.println(id + " 회원탈퇴 성공했습니다.");
        } else {
          System.out.println("회원정보 다시 입력부탁드립니다.");
        }//내부 else end

      }//y/N탈퇴 end
    }catch (Exception e) {System.out.println("에러이유" + e);}
  }//delete end


}


//  public void choice() {
//    select();
//    loop: while(true) {
//      System.out.print("\n1.회원가입 2.회원정보수정 3.회원탈퇴 4.back");
//      System.out.print("\n입력 :");
//      int sel = Integer.parseInt(sc.nextLine());
//
//      switch (sel) {
//        case 1: insert(); break;
//        case 2:  break;
//        case 3:  break;
//        case 4:  break loop;
//        default:
//          System.out.println("지원하지 않는 명령입니다.");
//      } 
//    }
//  }
