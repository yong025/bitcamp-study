package com.yong.day0701;

public class BitCamp_2 extends LA {//LA 클래스 상속 체리 메소드 호출

  public static void main(String[] args) {
    BitCamp_2 bk = new BitCamp_2();
    bk.book();
    //    his.cherry(); //static에서는 사용 불가하다
    //    super.cherry();//
  }

  public void book() {
    this.cherry(); //this 생략 가능
    super.cherry();// super. 을 붙이면 부모 클래스의 메소드도 출력 가능
    System.out.println("book 몽블랑");

    //LA클래스에 있는 cherry()메소드 재정의 { 제주산 체리 0:57 }
  }//end

  @Override // 오버라이드 생략가능
  public void cherry() {
    System.out.println("제주산 체리 11:01"); // 부모의 메소드를 재정의 가능
  }



}//class end
