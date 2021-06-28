package com.yong.capmtest0628;

public class Dunkin {
  public String coffee() {
    //Non-static메소드, 리턴값
    //객체화 생성후 객체명.coffee();
    Dunkin.donuts(3);
    String kind = "아이스 아메리카노";
    return kind;
  }//end

  public static void donuts(int cnt) {
    //static메소드 메소드(매개인자)
    System.out.println("도너츠메소드 주문갯수 "+cnt+" 입니다.");
  }//end

  public void menu() {//리턴값x, 매개인자x



  }//end
}//class End
