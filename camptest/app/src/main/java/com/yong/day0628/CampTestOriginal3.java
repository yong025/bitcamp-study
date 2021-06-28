package com.yong.day0628;


import java.util.Scanner;

public class CampTestOriginal3 {

  Scanner sc=new Scanner(System.in);
  boolean[] camp = new boolean[5]; //배열선언되면 자동으로 false초기값 세팅
  int num=0;

  public static void main(String[] args) {
    CampTestOriginal3 guest = new CampTestOriginal3(); 
    System.out.println("1차원배열 캠프예매 28일월요일 3:40 ");
    int sel=9; 

    guest.map();

    loop: while(true) {
      try {
        sel = guest.menu();

        switch(sel) {
          case 1: guest.input();break;
          case 2: guest.output();break;  
          case 3: guest.list(); break;
          case 9:
            System.out.println("캠프장예약프로그램을 종료합니다.");
            break loop;
          default: 
            System.out.println("1~3메뉴를 선택하셔야 합니다");
            break;
        }
      }catch (Exception e) {  }
    } 
  }

  int menu() {
    int sel;
    System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
    sel = Integer.parseInt(sc.nextLine());
    return sel;
  }

  void map() {
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    } //for end
  }

  void input() {
    System.out.print("예약캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //고객이 5입력
    if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); }
    if(camp[num-1]==true) {
      System.out.println("이미 예약된 캠프장 사용할수 없습니다");
    }else {
      System.out.println("camp["+num+"] 캠프장 예약성공");
      camp[num-1]=true; //false대신 진짜true값대입
    }

    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    } //for end
  }
  void output() {
    System.out.print("퇴실캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //3입력하면 
    if(camp[num-1]==true) {
      System.out.println("camp["+num+"] 캠프장 퇴실성공했습니다");
      camp[num-1]=false; 
    }else {
      System.out.println("camp["+num+"] 비어있는 캠프장입니다");
    }

    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    }
  }

  void list() {
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    } sc.close();
  }
}//class END

