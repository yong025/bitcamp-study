package com.yong.capmtest0628;

//값을 반환하지 않는다.
//생성자는 인스턴스를 생성해주는 역할을 하는 특수한 메소드라고 할 수 있다. 그런데 반환 값이 있다면 엉뚱한 객체가 생성될 것이다. 따라서 반환 값을 필요로하는 작업에서는 생성자를 사용하지 않는다. 반환 값이 없기 때문에 return도 사용하지 않고, 반환 값을 메소드 정의에 포함시키지도 않는다.

//생성자의 이름은 클래스의 이름과 동일하다.
//자바에서 클래스의 이름과 동일한 메소드는 생성자로 사용하기로 약속되어 있다.


class Calculator {
  int left, right;

  public Calculator(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public void sum() {
    System.out.println(this.left + this.right);
  }

  public void avg() {
    System.out.println((this.left + this.right) / 2);
  }
}

public class ConstructorDemo{

  public static void main(String[] args) {

    Calculator c1 = new Calculator(10, 20);
    c1.sum();
    c1.avg();

    Calculator c2 = new Calculator(20, 40);
    c2.sum();
    c2.avg();
  }

}
