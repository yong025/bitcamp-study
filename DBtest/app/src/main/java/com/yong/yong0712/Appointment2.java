package com.yong.yong0712;

import java.util.Date;
import java.util.Scanner;

public class Appointment2 extends MemberHandler{ // 스터디 약속
  static Scanner keyScan = new Scanner(System.in);

  public void viewAppointment() {
    DBbase();
    try { 
      msg = "select * from appointment";

      RS = ST.executeQuery(msg);
      //      System.out.println(msg);

      // 자바의 정석 39p 참고
      System.out.printf("%5s %10s %10s %10s %10s %10s %5s%n"
          , "번호", "제목", "장소", "시간","날짜", "ID","정원");
      System.out.println();
      while(RS.next() == true) {
        int num = RS.getInt("num");
        String title = RS.getString("title");
        String location = RS.getString("location");
        String time = RS.getString("time");
        Date date  = RS.getDate("written");
        String id = RS.getString("id");
        int numLimit = RS.getInt("numlimit");
        int assign = RS.getInt("assign");
        //System.out.printf(id + "\t" + grade +  "\t" + name+ "\t" + email+ "\t" + mobile+ "\t" + date+ "\t" + recommended+ "\t" + belongs);
        System.out.printf("%5s %10s %10s %10s %10s %10s %5s%n"
            , num, title, location, time  + "\t   ", date, id,assign + "/" +numLimit);
      }
    } catch(Exception ex) {
      System.out.println("잘못 입력입니다.");
    }
    System.out.println();
  }

  public void insertAppointment() {
    System.out.println("스터디 모집 게시판");
    DBbase();
    try {
      ST = CN.createStatement();
      System.out.print("\n제목 : ");
      String title = keyScan.nextLine();
      System.out.print("장소 : ");
      String location = keyScan.nextLine();
      System.out.print("시간 : ");
      String time = keyScan.nextLine();
      System.out.print("정원 : ");
      int numLimit = Integer.parseInt(keyScan.nextLine());
      msg = "insert into appointment(num, title, location, time, written, id, numlimit, viewcount) "
          + "values(seq.nextval, ?, ?, ?, sysdate, '" + id  + "',? ,0)";
      PST = CN.prepareStatement(msg);
      PST.setString(1, title);
      PST.setString(2, location);
      PST.setString(3, time);
      PST.setInt(4, numLimit);

      int condition = PST.executeUpdate();
      if (condition > 0) {
        System.out.println(title + " 게시글이 등록되었습니다.");
      } else {
        System.out.println(title + " 게시글 등록이 실패했습니다.");
      }
    } catch (Exception e) {
      System.out.println("잘못된 입력입니다.");
    }
    System.out.println();
  }
  public void deleteAppoinment() {
    DBbase();
    //    NUM                                       NOT NULL NUMBER
    //    TITLE                                     NOT NULL VARCHAR2(10)
    //    LOCATION                                  NOT NULL VARCHAR2(10)
    //    TIME                                      NOT NULL VARCHAR2(8)
    //    REPLY                                              VARCHAR2(10)
    //    WRITTEN                                   NOT NULL DATE
    //    ID                                        NOT NULL VARCHAR2(10)
    //    NUMLIMIT                                           NUMBER
    //    VIEWCOUNT                                          NUMBER
    try {
      System.out.print("\n삭제할 게시글 번호 입력 : ");
      int num = Integer.parseInt(keyScan.nextLine());
      System.out.print("삭제할 게시글 제목 입력 : ");
      String title = keyScan.nextLine();

      System.out.println("정말 삭제하시겠습니까? [y / N]");
      if(!keyScan.nextLine().equals("y")) {
        System.out.println("게시글 삭제 취소하셨습니다.");
      } else {
        msg = "delete from appointment where num = ? and title = ?" ;
        PST = CN.prepareStatement(msg);
        PST.setInt(1, num);
        PST.setString(2, title);

        int condition = PST.executeUpdate();
        if (condition > 0) {
          System.out.println(num + "번 게시글 '" + title +"' 삭제 성공했습니다.");
        } else {
          System.out.println(num + "번 게시글 '" + title +"' 삭제 실패했습니다.");
        }//내부 else end

      }//delete y/N end
    } catch (Exception e) {
      System.out.println("에러이유" + e);
    }
  }//delete end

  public void updateAppointment() {
    DBbase();
    try {
      //수정처리는 대상필드 name,title

      System.out.print("수정할 게시글 제목 입력 :");
      String updatetitle= keyScan.nextLine(); 
      System.out.print("장소 수정내역 입력  :");
      String location = keyScan.nextLine();
      System.out.print("시간 수정내역 입력  :");
      String time = keyScan.nextLine();
      System.out.print("총인원 수정내역 입력  :");
      int numlimit = Integer.parseInt(keyScan.nextLine());


      msg = "update appointment set location= ?, time = ?, numlimit =? where title = ?" ;
      System.out.println(msg);
      PST = CN.prepareStatement(msg);
      PST.setString(1, location);
      PST.setString(2, time);
      PST.setInt(3, numlimit);
      PST.setString(4, updatetitle);

      int condition = PST.executeUpdate();
      if (condition > 0) {
        System.out.println( "게시글 수정 성공");
      }else {
        System.out.println( "게시글 수정 실패");
      }

    }catch(Exception ex) { }
  }

  public void joinStudy() { //role1~4 컬럼 생성해야함

    try {
      System.out.print("참여할 프로젝트의 번호를 선택하세요 : ");
      String number = keyScan.nextLine();
      String msg = "select title,location,time,numLimit,assign from appointment where num = '" + number + "'" ;

      RS = ST.executeQuery(msg);
      while(RS.next() == true) {

        String title = RS.getString("title");
        String location = RS.getString("location");
        String time = RS.getString("time");
        int numLimit = RS.getInt("numLimit");
        int assign = RS.getInt("assign");

        System.out.println("-----------------------------프로젝트 게시판----------------------------");
        System.out.println();
        System.out.printf("프로젝트명 : %s \n", title);
        System.out.printf("장소 : %s \n", location);
        System.out.printf("시간 : %s \n", time);
        System.out.printf("모집현황 : 총원 %d 중 %d명 모집 중 \n", numLimit, assign);

        System.out.println("참여 하시겠습니까? [y / N]");
        if(keyScan.nextLine().equals("y")) {
          System.out.printf("'%s' 프로젝트 참여 신청란입니다. \n", title);

          System.out.println("지원 직군을 선택해주세요.");
          System.out.println("1. 프로젝트 매니저 2. 문서작업관리자 3. 무지성코더 4. 지성코더");
          System.out.println("입력 >>>>");
          int command = Integer.parseInt(keyScan.nextLine());

          msg = "select role"+command+" from appointment where num = " + number;
          String role = "role"+command;

          RS = ST.executeQuery(msg);
          while(RS.next() == true) {
            String result = RS.getString(role);

            if(result.equals("true")) {  // 역할 마감
              System.out.println("선택한 역할이 마감되었습니다.");
            } else {    // 역할 마감 안됨
              msg = "update appointment set role"+ command +"= 'true' where num = "+ number;
              System.out.println(msg);

              int joincheck  = ST.executeUpdate(msg);
              if(joincheck > 0) {
                // 스터디 모집현황 assign 컬럼의 값을 1 늘려줌
                assign++;
                msg = "update appointment set assign ="+ assign + "where title ='"+title+"'";
                int condition = ST.executeUpdate(msg);

                if(condition > 0) {
                  System.out.println("참가신청이 완료되었습니다.");
                }else{
                  System.out.println("참가신청이 실패하였습니다.");
                }//condition else end
              }//joincheck end
            }
          }

        }else {
          System.out.println("참가신청이 취소되었습니다. 초기화면으로 돌아갑니다.");
        }

      }
    } catch(Exception e) { }


    /*


    DBbase();
    msg = "select numLimit from appointment where num = ?";
    PST
      RS = ST.executeQuery(msg);

    if () {

    }
     */

  }

  //  public void reply() {
  //    System.out.println("댓글추가");
  //    DBbase();
  //    try {
  //      ST = CN.createStatement();
  //
  //      System.out.print("\n댓글입력 : ");
  //      String contents = keyScan.nextLine();
  //
  //      msg = "insert into reply (contents) values(?)";
  //
  //      PST = CN.prepareStatement(msg);
  //      PST.setString(1, contents);
  //
  //      System.out.println(msg);
  //
  //      int OK = PST.executeUpdate();
  //      if (OK>0) {
  //        System.out.println("댓글이 등록되었습니다.");
  //      }else { System.out.println("댓글등록을 실패했습니다.");}
  //    }catch (Exception e) {}
  //  }
}

