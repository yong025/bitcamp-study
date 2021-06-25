package com.eomcs;
// 인스턴스 변수 사용하면 같은 클래스를 사용해도 변수만 수정하면 사용 가능
class Calculator2{
  int result;

  static void plus(Calculator2 c, int value) {//메소드 호출시 파라미터로 항상 값을 받아야함.
    //클래스를 여러개 만들 필요없고, new로 변수를 언제든지 만들어 사용할 수 있다.
    c.result += value;
  }
}

public class Test2{
  public static void main(String[] args) {
    Calculator2 obj1 = new Calculator2();
    Calculator2 obj2 = new Calculator2();

    Calculator2.plus(obj1,100);// 주소장소와 값을 호출
    Calculator2.plus(obj1,200);
    Calculator2.plus(obj1,300);

    Calculator2.plus(obj2,111);
    Calculator2.plus(obj2,222);

    System.out.println(obj1.result);
    System.out.println(obj2.result);
  }
}
