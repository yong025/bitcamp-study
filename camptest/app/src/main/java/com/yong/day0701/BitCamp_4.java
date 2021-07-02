package com.yong.day0701;

public class BitCamp_4 extends Father implements AAA, BBB{

  public static void main(String[] args) {
    BitCamp_4 bc4 = new BitCamp_4();
    bc4.game();
  }//end

  public void game() {
    System.out.println("삼국지 ");
    int money = this.bank();
  }

  @Override
  public void apple() {
    System.out.println("BitCamp_4소속의 apple메소드");
  }

  @Override
  public void memeo() {

  }

  @Override
  public boolean nullcheck(int key) {
    return false;
  }

  @Override
  public void blue() {

  }

}//class end
