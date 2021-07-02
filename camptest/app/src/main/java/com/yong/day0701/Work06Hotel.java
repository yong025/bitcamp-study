package com.yong.day0701;

import java.util.Scanner;

public class Work06Hotel {   

  private int floor ; //층=행 3층
  private int room ;  //호=열 5호  3층*5열=15방구성
  private String[][] name = new String[3][5];
  private String title;
  private String cos;


  public Work06Hotel(){ }
  public Work06Hotel(String name){ }
  public Work06Hotel(String name, int year){ }

  Scanner sc = new Scanner(System.in);

  public void process() {
    //map()호출
    map();

    int sel = 9;

    while(true) {
      System.out.print("\n1.투숙  2.퇴실  3.map  4.list 9.종료 >>>");
      sel = Integer.parseInt(sc.nextLine());

      loop: switch (sel) {
        case 1 : checkIn(); break;
        case 2 : checkOut(); break;
        case 3 : map(); break;
        case 4 : list(); break;
        case 9 : 
          System.out.println("호텔예약프로그램 종료합니다");
          break loop;
        default:
          System.out.println("다시 입력해주세요.");
          break;
      }//switch end
    }//while end
  }


  public void checkIn() {// java-project01 add 참고
    System.out.println("입실 예약");

    System.out.println(">몇층에 투숙?");
    int floor = Integer.parseInt(sc.nextLine());
    System.out.println(">몇호에 투숙?");
    int room = Integer.parseInt(sc.nextLine());
    System.out.println(">투숙객 이름?");
    String cos = sc.nextLine();
    name[floor-1][room-1] = cos;



    System.out.println("예약을 완료했습니다.");
  }//end

  public void checkOut() {

    System.out.println("퇴실 신청");

    System.out.println(">몇층에 투숙?");
    int floor = Integer.parseInt(sc.nextLine());
    System.out.println(">몇호에 투숙?");
    int room = Integer.parseInt(sc.nextLine());
    name[floor-1][room-1] = cos;

    if (cos == null) {   
      System.out.println(floor + "0" + room + "호실, 퇴실 완료되었습니다.");
    } else {
      System.out.println(floor + "0" + room + "호실은 아무도 투숙하고 있지 않습니다.");
    }

  }//end

  public void map(){ //non-static메소드 
    System.out.println("\n\t[ "+ title +" 투숙 상태 ]");
    for(int i = 0; i < 3; i++){
      for(int b = 0; b < 5; b++){
        System.out.print((i+1)+"0"+(b+1)+"\t");
      }

      System.out.println(); //이름표시 공백란입니다

      for(int j = 0; j < 5; j++){
        if(this.name[i][j] == null){
          System.out.print("\t");
          continue;
        }//if end
        System.out.print(this.name[i][j]+"\t"); 
      }//j end
      System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); // \n꼭넣으세요 
    }//for i end
  } //map end

  public void list() { //영림쌤 구현해서 보여드리겠습니다 

  }//end

  public static void main(String[] args) {
    System.out.println("7월1일 목요일  4시19분");
    Work06Hotel wh = new Work06Hotel();
    wh.process();
  }//end
}//class END

