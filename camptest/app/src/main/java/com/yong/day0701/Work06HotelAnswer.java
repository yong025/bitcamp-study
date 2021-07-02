package com.yong.day0701;

import java.util.Scanner;

public class Work06HotelAnswer {

  private int floor;//층=행 3층
  private int room; //호=열 3층*5열=15방구성
  private String[][] name = new String[3][5];
  private String title ="";
  private Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Work05Hotel wh = new Work05Hotel("웨스틴조선호텔");
    wh.process();
  } // mein end

  public Work06HotelAnswer() { }
  Work06HotelAnswer(String title) {

    this.title = title;
  } // end

  public Work06HotelAnswer(String name, int year) { }

  public void process() {
    System.out.printf("%13s%.5s%13s%n", "", this.title, "");
    System.out.printf("%4s%.5s 방문을 환영합니다.%4s%n", "", this.title, "" );
    this.map();
    int sel = 9;
    while(true) {
      try {
        System.out.print("\n1.투숙 2.퇴실 3.map 4.list 9.종료 >> ");
        sel = Integer.parseInt(sc.nextLine().trim());
        if(sel==9) {
          System.out.println("호텔예약프로그램 종료합니다.");
          System.exit(1);
        }
        switch(sel) {
          case 1:
            checkIn();
            break;
          case 2:
            checkOut();
            break;
          case 3:
            map();
            break;
          case 4:
            list();
            break;
          default:
        } // switch end
      }
      catch(Exception e) {
        System.out.println("에러 찾아서 고치기 귀찮습니다. 알아서 잘 입력하세요! ....");
      }
    }

  } //end

  public void checkIn() {
    System.out.print(" >몇층에 투숙? ");
    int inputFloor = Integer.parseInt(sc.nextLine().trim());
    System.out.print(" >몇호에 투숙? ");
    int inputRoomNumber = Integer.parseInt(sc.nextLine().trim());
    System.out.print(" >투숙객 이름? ");
    String inputGuestName = sc.nextLine().trim();

    if(name[inputFloor-1][inputRoomNumber-1] == null) {
      name[inputFloor-1][inputRoomNumber-1] = inputGuestName;
      System.out.println("# 성공적으로 checkIn 되었습니다.");
      map();
    } else {
      System.out.println("# 이미 투숙객이 있는 방입니다.");
      map();
    }
  } //end

  public void checkOut() {
    System.out.print(" >몇층에 퇴실? ");
    int inputFloor = Integer.parseInt(sc.nextLine().trim());
    System.out.print(" >몇호에 퇴실? ");
    int inputRoomNumber = Integer.parseInt(sc.nextLine().trim());

    if(name[inputFloor-1][inputRoomNumber-1] == null) {
      System.out.println("# 비어있는 방에 checkOut 할 수 없습니다.");
      map();
    } else {
      name[inputFloor-1][inputRoomNumber-1] = null;
      System.out.println("# 성공적으로 checkOut 되었습니다.");
      map();
    }
  } //end

  public void map() {
    System.out.printf("\n———[%.5s 투숙 상태]—————%n", this.title);
    for(int i = 0; i < name.length; i++) {
      for(int j = 0; j < name[i].length; j++) System.out.printf("%d%02d\t", i+1, j+1);
      System.out.println();
      for(int j = 0; j < name[i].length; j++) System.out.printf("%s\t", name[i][j]==null ? "" : name[i][j]);
      System.out.println("\n———————————————————");
    }
  } //end

  public void list() {
    for(int i = 0; i < name.length; i++) {
      for(int j = 0; j < name[i].length; j++) {
        System.out.printf("%d%02d호 %s\t",i+1,j+1, name[i][j] == null ? "◻\t︎" : "◼ ︎" + name[i][j] );
      }
      System.out.println();
    }
  } //end

}

