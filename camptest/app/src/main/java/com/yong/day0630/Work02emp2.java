package com.yong.day0630;

import java.io.InputStream;

public class Work02emp2 {
  public static void main(String[] args) {
    //자바에서 표준입력 ascii코드 byte형태
    //자바에서 표준입력 System.in 키보드입력
    //System.in ; static InputStream in 필드
    //java.util패키지 Scanner생성자 3번째(InputStream)
    try {
      InputStream is = System.in ;
      System.out.println("단입력>>> ");
      int dan = is.read();
      for(int a=1; a<10; a++) {
        System.out.println(dan+"*"+a+"="+(dan*a));
      }
    }catch (Exception e) {
    }
  }
}
