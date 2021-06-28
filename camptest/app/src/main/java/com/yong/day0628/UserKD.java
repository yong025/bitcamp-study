package com.yong.day0628;

import com.yong.capmtest0628.Dunkin;

public class UserKD {

  public static void main(String[] args) {
    //문제 Dunkin클래스 coffee메소드호출, donuts메소드호출
    System.out.println("UserDK클래스 3: 40");
    Dunkin.donuts(3);
    //static 메서드는 바로 접근 할 수 있다. 
    //매개인자(파라미터)값 넣어줘야 함.
    //import 패키지는 필수.

    Dunkin dk = new Dunkin();
    dk.coffee();//static이 아닌 메서드는 인스턴스 선언 후에 불러올 수 있다.
    String msg = dk.coffee();
    System.out.println("주문한 음료는 " +msg+ "입니다.");
  }//end
}//class END
