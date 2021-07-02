package com.yong.day0701;

import java.util.Scanner;

public class Reservation {

  public static void main(String[] args) {


    // 2차원 배열을 이용
    int [][] seats = new int[10][10];

    // 반복 flag
    boolean isRun = true;

    // 열이름
    String strColumn;
    char inputColumn;

    // 행번호
    int rowNum;

    Scanner sc = new Scanner(System.in);

    do {

      System.out.println();
      System.out.println("────────────────────────────────────SCREEN────────────────────────────────────");
      System.out.println();
      for (int i = 0; i < seats.length; i++) {
        System.out.print(" [ "+(i+1)+" ] ");
      }
      System.out.println(" [행] ");

      for (int i = 0; i < seats.length; i++) {
        System.out.println();
        for (int j = 0; j < seats[i].length; j++) {

          if(seats[i][j] == 0) {
            System.out.print("[ □ ]");
          }else {
            System.out.print("[ ■ ]");
          }
        }
        System.out.println(" [ "+ (char)(i+65) +" ] 열");
      }
      System.out.print("───────────────────────────────────────────────────────────────────────────────");
      System.out.print("\n예약하실 좌석의 열을 입력해주세요 (예약종료는 exit) : ");

      strColumn = sc.next();

      if(strColumn.equals("exit")) {
        System.out.println("종료되었습니다");
        break;
      }

      inputColumn = strColumn.trim().charAt(0);
      System.out.println("입력한 열 : " +inputColumn);

      if(inputColumn < 65 || inputColumn > 74) {
        System.out.println("선택할 수 없는 좌석입니다");
        continue;
      } 

      int column = inputColumn - 65;

      System.out.print("예약하실 좌석의 행 번호를 입력해주세요 : ");
      rowNum = sc.nextInt();

      if(rowNum < 1 || rowNum > 10) {
        System.out.println("선택할 수 없는 행 번호입니다");
        continue;
      }

      System.out.println("선택하신 좌석은 : " +inputColumn+ " 열이고 " + rowNum + " 행입니다");
      System.out.println("예약 완료 하시겠습니까 ? (Yes / No) : ");

      String s = sc.next();
      if(s.equals("y") || s.equals("Y")) {
        seats[column][rowNum - 1] = 1;
        System.out.println("예약이 완료되었습니다");
      }else {
        System.out.println("취소되었습니다");
        isRun = false;
      }

    } while (isRun);

  }
}





