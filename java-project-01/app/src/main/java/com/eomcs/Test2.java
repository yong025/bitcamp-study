package com.eomcs;


public class Test2{
  static class A {
    int x;
  }
  static class B {
    int y;
  }
  static class C {
    int z;
  }

  public static void main(String[] args) {
    A r1 = new A();
    r1.x = 100;

    Object obj = new A();// A설계도에 따라 x라는 변수를 만들고 obj라는 변수주소에 넣어라

    //x에는 실제 A의 인스턴스 주소가 저장된 것이 맞지만,
    //컴파일러 입장에서는 obj변수의 클래스를 가지고 변수를 찾기 때문에
    //컴파일러 오류가 발생한다.

    //obj에 들어있는 인스턴스 주소를 제대로 사용하려면
    //원래 타입으로 형변환 한 다음에 사용하라.
    A r2 = (A) obj;
    r2.x = 100; // OK!
  }
}
