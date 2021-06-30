package com.yong.day0630Interface;

public interface BoardImp {
  //키워드 class 대신 interface
  //인터페이스는 메소드 선언만 = abstract method = 추상메소드 = 명세서
  //apstract키워드 생량가능, 기술해도 에러없음
  //인터페이스 = 메모 = 명세서 
  //인터페이스 상속을 받아서 재활용 = 재정의 = OverRiding = 오버라이딩
  //상속받은 클래스에서 재정의 의미 @OverRiding 생략가능
  public abstract int boardcount();//바디 x
  public void boardInsert();
  public void boardDelete(int num);
  //******역할 분담을 할 때 분담할 것을 취합한 명세서******
}//interface END
