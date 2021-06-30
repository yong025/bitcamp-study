package com.yong.day0629;

public class TestBook {

  public int m = 7800;

  public static void main(String[] args) {


    TestBook t = new TestBook();
    t.note();
    new TestBook().note();// 익명의 개체

  }//main end

  public void note() {// Non static 메소드

    int m = 2400;

    System.out.println("책 가격 = " + m);//2400
    System.out.println("책 가격 = " + this.m);//7800
    //static 에선 this 사용 x 
  }
}