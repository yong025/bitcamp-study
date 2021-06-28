package com.eomcs;

import java.util.Scanner;

public class CampTest1 {

  static final int CAMP_LENGTH = 5;
  static int size =0;

  public static void main(String[] args) {
    System.out.println("1차원배열 캠프예매 28일 월요일 ");
    Scanner sc=new Scanner(System.in);
    boolean[] camp = new boolean[5]; // 0번째 1번째 2번째 3번째 4번째
    int sel=9, num=0;

    //    extracted(camp);

    while(true) {
      try {
        System.out.print("\n1.예약  2.퇴실  3.보기  9.종료 : ");
        sel = Integer.parseInt(sc.nextLine());

        if(sel==9) {
          System.out.println("캠프장예약프로그램을 종료합니디");
          break;
        }

        switch(sel) {
          case 1: extracted(sc); break;
          case 2: extracted2(sc);break;  
          case 3: extracted3(camp); break;
          default: 
            System.out.println("1~3메뉴를 선택하셔야 합니다");
            break;   
        }//switch end
      }catch (Exception e) {   }
    }//while

    sc.close();
  }//end

  static void extracted(Scanner sc) {//케이스 1 캠핑장 예약
    int num;
    System.out.print("예약캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //고객이 5입력
    if(num <1 || num >5) { System.out.println(num +"번호를 사용할수 없습니다"); 
    }

    System.out.println("캠핑장 예약이 완료되었습니다.");

    num++;
  }

  static void extracted2(Scanner sc) {
    int num;
    System.out.print("퇴실캠핑번호 입력>>> ");
    num=Integer.parseInt(sc.nextLine()); //3입력하면 
    System.out.println("퇴실 완료되었습니다.");
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
}//class END