package com.eomcs;

import java.util.Scanner;


public class CampTest2 {

  public static void main(String[] args) {
    System.out.println("1차원배열 캠프예매 28일 월요일 ");
    Scanner sc=new Scanner(System.in);
    boolean[] camp = new boolean[5]; // 0번째 1번째 2번째 3번째 4번째
    int sel=9, num=0;


    extracted3(camp); 
    while(true) {
      try {
        System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
        sel = Integer.parseInt(sc.nextLine());

        if(sel==9) {
          System.out.println("캠프장예약프로그램을 종료합니디");
          break;
        }

        switch(sel) {
          case 1: extracted(sc, camp);break;
          case 2:extracted2(sc, camp);break;
          case 3: extracted3(camp); //for end //전체예약상태
          break;
          default: 
            System.out.println("1~3메뉴를 선택하셔야 합니다");
            break;   
        }//switch end
      }catch (Exception e) {   }
    }//while 
    sc.close();
  }

  static void extracted(Scanner sc, boolean[] camp) {
    int num;
    System.out.print("예약캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); 
    if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); 
    } if(camp[num-1]==true) {
      System.out.println("이미 예약된 캠핑장 입니다.");
    }else {
      System.out.println("camp["+num+"] 캠핑장 예약성공");
      camp[num-1]=true;
    }
  }
  static void extracted2(Scanner sc, boolean[] camp) {
    int num;
    System.out.print("퇴실캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //3입력하면 
    if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); 
    }
    if(camp[num-1]==true) {
      System.out.println("camp["+num+"] 캠프장 퇴실성공했습니다.");
      camp[num-1]=false;
    }else {
      System.out.println("camp["+num+"] 비어있는 캠프장입니다..");
    }
  }
  static void extracted3(boolean[] camp) {
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    }      
  }
}