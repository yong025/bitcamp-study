package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class MemberHandler02 implements Handler02 {

  static class Member{

    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }

  String memberGroupName;
  Scanner scn;
  ArrayList02 memberList = new ArrayList02();

  MemberHandler02(String memberGroupName, Scanner scn){
    this.memberGroupName = memberGroupName;
    this.scn = scn;
  }

  public void execute() {
    loop: while(true) {
      System.out.print(this.memberGroupName + "회원 관리> ");
      String command = scn.nextLine();

      switch(command) {
        case "list": this.list(); break;
        case "join": this.join(); break;
        case "update": this.update(); break;
        case "view":  this.view(); break;
        case "delete": this.delete(); break;
        case "back":
          System.out.println("메뉴로 돌아갑니다.");
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println();
    }
  }
  void join() {
    System.out.println(this.memberGroupName + "[회원 등록]");

    if(this.memberList.start == ArrayList02.MAX_INT) {
      System.out.println("회원 가입 한도 초과");
      return;
    }

    Member member = new Member();

    System.out.print("이름: ");
    member.name = this.scn.nextLine();

    System.out.print("email: ");
    member.email = this.scn.nextLine();

    System.out.print("비밀번호: ");
    member.password = this.scn.nextLine();

    System.out.println("재직여부: (y/N)");
    if(this.scn.nextLine().equals("y")) {
      member.working = true;
    }else {
      member.working = false;
    }

    member.registeredDate = new Date();

    this.memberList.append(member);

    System.out.println("회원가입이 완료되었습니다.");
  }
  void list() {
    System.out.println("[회원 목록]");

    Object[] arr = this.memberList.toArray();

    for(int i = 0; i <arr.length; i++) {
      Member member = (Member) arr[i];
      System.out.printf("번호: %d,이름: %s, 가입일시: %s, 재직여부: %b\n",
          i,
          member.name,
          String.format("%1$tY-%1$tm-%1$td", member.registeredDate),
          member.working);
    }
  }
  void update() {
    System.out.println("[회원정보 변경]");

    System.out.print("번호? ");
    int index =Integer.parseInt(this.scn.nextLine());

    if(index < 0 || index >= this.memberList.start) {
      System.out.println("무효한 회원입니다.");
      return;
    }

    Member member = (Member) this.memberList.retrieve(index);

    System.out.printf("(%s)에서 수정할 이름", member.name);
    String name = scn.nextLine();

    System.out.printf("(%s)에서 수정할 email", member.email);
    String email = scn.nextLine();

    System.out.printf("수정할 비밀번호", member.password);
    String password = scn.nextLine();


    System.out.printf("재직 여부 (y/N)", member.working ? "예" : "아니오");
    boolean working = false;
    if(scn.nextLine().equals("y")) {
      working = true;
    }

    System.out.print("정말 변경하시겠습니까? y/N");
    if(!scn.nextLine().equals("y")) {
      System.out.println("변경을 취소하였습니다.");
      return;
    }

    member.name = name;
    member.email = email;
    member.password = password;
    member.working = working;

    System.out.println("회원정보 변경이 완료되었습니다.");
  }

  void view() {
    System.out.println("[회원 상세조회]");

    System.out.print("번호? ");
    int index =Integer.parseInt(this.scn.nextLine());

    if(index < 0 || index >= memberList.start) {
      System.out.println("무효한 회원입니다.");
      return;
    }

    Member member = (Member) this.memberList.retrieve(index);

    System.out.printf("이름: %s\n", member.name);
    System.out.printf("email: %s\n", member.email);
    System.out.printf("가입일: %1$tY-%1$tm-%1$td\n", member.registeredDate);
    System.out.printf("재직여부: %s\n", member.working ? "예" : "아니오");
  }

  void delete() {
    System.out.println("[회원 탈퇴]");

    System.out.print("번호? ");
    int index =Integer.parseInt(this.scn.nextLine());

    if(index < 0 || index >= this.memberList.start) {
      System.out.println("무효한 회원입니다.");
      return;
    }

    System.out.print("정말 탈퇴하시겠습니까? y/N");
    if(!this.scn.nextLine().equals("y")) {
      System.out.println("탈퇴를 취소하였습니다.");
      return;
    }

    this.memberList.remove(index);

    System.out.println("회원을 탈퇴하였습니다.");
  }
}




