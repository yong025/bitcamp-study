package com.yong.day0630;

public class Child extends Father { //Father, Mother 상속을 두개 한번에는 받을 수 없음.
  public static void main(String[] args) {
    //모든 클래스는 최상위 object클래스 상속받았음
    //클래스에 final 있으면 상속못함 
    Child cd = new Child();
    int a = cd.bank();

  }

  public void book() { int m = bank(); }
}

