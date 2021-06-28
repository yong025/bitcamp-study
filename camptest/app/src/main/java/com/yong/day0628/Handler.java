package com.yong.day0628;

import java.util.Scanner;

public class Handler {

  static Scanner sc;

  static int menu() {
    int sel;
    System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
    sel = Integer.parseInt(sc.nextLine());
    return sel;
  }

  static void input(Scanner sc, boolean[] camp) {
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

  static void output(Scanner sc, boolean[] camp) {
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

  static void list(boolean[] camp) {
    for(int i=0; i<camp.length; i++) {
      if(camp[i]==true) {
        System.out.println("  "+ (i+1)+"번째 ■캠프사용중입니다 "  );
      }else {
        System.out.println("  "+ (i+1)+"번째 □캠프장은 비어 있습니다 "  ); 
      }
    }      
  }
}
