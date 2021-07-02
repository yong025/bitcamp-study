package com.yong.capmtest0628;

public class Dunkin {
  protected Dunkin() { } // protected는 다른 패키지는 접근 불가

  protected String coffee() {
    return "아이스라떼";
  }//end

  protected void donuts(int cnt) {
    //static메소드 메소드(매개인자)
    System.out.println("도너츠메소드 주문갯수 "+cnt+" 입니다.");


  }//end
}//class End
