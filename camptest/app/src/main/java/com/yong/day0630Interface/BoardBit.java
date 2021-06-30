package com.yong.day0630Interface;

public class BoardBit implements BoardImp {

  public static void main(String[] args) {

  }

  @Override
  public int boardcount() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void boardInsert() {
    // TODO Auto-generated method stub

  }

  @Override
  public void boardDelete(int num) {
    // TODO Auto-generated method stub
    //@Override 생략가능
  }//end

  @Override
  public void index() {
    //인터페이스 소속아님, 상속X, 재정의 대상X
    //@Override 기술하면 에러
  }//end

}//class end
