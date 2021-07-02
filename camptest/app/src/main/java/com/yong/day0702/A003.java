package com.yong.day0702;

import com.yong.capmtest0628.Dunkin;

public class A003 {

  public static void main(String[] args) {
    Bank bk = new Bank();


    bk.cal();
    Dunkin dd = new Dunkin();
    String name = dd.coffee();
    dd.donuts(7);
  }//camptest0628폴더의 Dunkin과 함께 사용

}
