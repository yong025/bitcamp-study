package com.yong.day0701;

import java.util.Scanner;

public class Work05Hotel {
  //생성자 클래스이름, 리턴값X, void기술X
  //생성자 사용은 new키워드 다음에 기술   클래스 ob = new 클래스()
  //생성자는 중복 가능, 기본 생성자 생량 가능
  //멤버 필드 = 전역변수 private
  //private메소드는 다른 클래스에서 절대 호출할 수 없다.
  private int floor ;// 층=열 3층
  private int room; // 호=행 5호 3층*5열 = 15방 구성
  private String[][] name = new String[3][5];
  private String title;
  boolean bool = true;
  boolean check = false;
  int s = 0, n = 0;

  public Work05Hotel() { }
  public Work05Hotel(String name) { }
  public Work05Hotel(String name, int year ) { }
  Scanner sc = new Scanner(System.in);

  public void process() {
    int sel = 9;

    while(true) {

      System.out.print("\n1.투숙 2.퇴실 3.map 4.list 9.종료 >>> ");
      sel = Integer.parseInt(sc.nextLine());


      switch(sel) {

        case 1 : checkIn(); break;
        case 2 : checkOut(); break;
        case 3 : map(); break;
        case 4 : list(); break;
        case 9 :
          System.out.println("호텔 예약 프로그램을 종료합니다.");
          System.exit(1);
        default :
          System.out.println("잘못 입력하셨습니다.");
          break;
      }//switch end
    }//while end
  }//process end

  public void checkIn() {
    System.out.println("입실 예약");

    System.out.println(">몇층에 투숙?");
    int floor = Integer.parseInt(sc.nextLine());
    System.out.println(">몇호에 투숙?");
    int room = Integer.parseInt(sc.nextLine());
    System.out.println(">투숙객 이름?");
    String cos = sc.nextLine();
    name[room-1][floor-1] = cos;




  }//checkin end

  public void checkOut() {

  }//checkout end

  public void map() {//printAll() = list() = display()  
    System.out.println("\n\t["+title+"투숙 상태]");
    for(int i = 0; i < 3; i++) {
      for(int b = 0; b < 5; b++) {
        System.out.print((i+1)+"0"+(b+1)+"\t");
      }
      System.out.println();//이름공백표시

      for(int j =0; j < 5; j++) {
        if(this.name[i][j] == null) {
          System.out.println("\t");
          continue;
        }
        System.out.print(this.name[i][j]+"\t"); 
      }
      System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); // \n꼭넣으세요
    }

  }
  public void list() {//영림 구현

  }//check end


  public static void main(String[] args) {

    Work05Hotel sh = new Work05Hotel("호텔 신라");
    sh.process();


  }
}
