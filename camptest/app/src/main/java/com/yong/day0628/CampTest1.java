package com.yong.day0628;

import java.util.Scanner;


public class CampTest1 {

  static Scanner sc=new Scanner(System.in);

  public static void main(String[] args) {

    Handler.sc = sc;

    System.out.println("1차원배열 캠프예매 28일 월요일 3:40 ");
    boolean[] camp = new boolean[5]; // 0번째 1번째 2번째 3번째 4번째
    int sel=9, num=0;

    loop: while(true) {
      try { 
        sel = Handler.menu();

        switch(sel) {
          case 1: Handler.input(sc, camp);break;
          case 2: Handler.output(sc, camp);break;
          case 3: Handler.list(camp); break;
          case 9:
            break loop;
          default: 
            System.out.println("1~3메뉴를 선택하셔야 합니다");
            break;   
        }//switch end
      }catch (Exception e) {   }
    }//while 종료
    sc.close();
    System.out.println("캠프장예약프로그램을 종료합니다.");
  }
}

