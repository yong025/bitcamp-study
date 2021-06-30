package com.yong.day0630;

import java.io.InputStream;

public class Work03gugudan {
  public static void main(String[] args) throws Exception {//이문장 어딘가에서 예외처리가 되어있음

    //자바에서 표준입력 ascii코드 byte형태
    //자바에서 표준입력 System.in 키보드입력
    //System.in ; static InputStream in 필드

    InputStream is = System.in ;
    System.out.print("단입력>>> ");
    int dan = is.read();
    for(int a=1; a<10; a++) {
      System.out.println(dan+"*"+a+"="+(dan*a));
    }
  }
}
