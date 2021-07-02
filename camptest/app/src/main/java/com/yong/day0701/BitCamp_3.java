package com.yong.day0701;

public class BitCamp_3  {
  public BitCamp_3() { this("종로점", 7, "AIA"); }  //this로 호출
  public BitCamp_3(int floor) {  }//기본 생성자는 생략 가능
  public BitCamp_3(String location) { }
  public BitCamp_3(String location, int floor, String name) {  
    System.out.println(location + "지점 " + floor + "층 " + name + " 입니다.");
  }

  public static void main(String[] args) {
    BitCamp_3 bc = new BitCamp_3("종로점", 7, "AIA");
    bc.coffee(); //this ()현재 클래스 생성자 접근
  }//end

  public void coffee() {//Non-static
    System.out.println("coffee 맥심 카누");
    this.cookie(); // this키워드 생략가능
  }//end

  public void cookie() { //Non-static
    System.out.println("cookie 촉촉한 초코칩");

  }//end
}//class end
