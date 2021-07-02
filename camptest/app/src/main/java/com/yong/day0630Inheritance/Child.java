package com.yong.day0630Inheritance;

public class Child extends Father { //Father, Mother 상속을 두개 한번에는 받을 수 없음.
  //Father 부모소속 car( ) 메소드 호출
  //child자식소속 car( ) 메소드 호출


  public static void main(String[] args) {
    //모든 클래스는 최상위 object클래스 상속받았음
    //클래스에 final 있으면 상속못함 
    Child ck = new Child();
    Father ob = new Child();//부모 클래스를 자식 클래스로 재생
    ck.car();
    ob.car();



  }

  public void book() {
    super.car();
    this.car();
  }

  @Override
  public void car() {
    // TODO Auto-generated method stub
    super.car();
  }
}

