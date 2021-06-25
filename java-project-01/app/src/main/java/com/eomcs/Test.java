package com.eomcs;

class Calculator1{
  static int result;//스태틱 변수

  static void plus(int value) {
    Calculator1.result += value;//스태틱 변수는 클래스 이름으로 직접 접근 가능
  }
}

public class Test{
  public static void main(String[] args) {
    Calculator1.plus(100);
    Calculator1.plus(200);
    Calculator1.plus(300);
    System.out.println(Calculator1.result);
  }
}
