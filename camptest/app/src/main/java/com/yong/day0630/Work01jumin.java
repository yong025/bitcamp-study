package com.yong.day0630;

public class Work01jumin {
  public static void main(String[] args) {
    String min = "871024-1541965";
    String min1 = "871024";
    String min2 = "1541965";

    String minA = min.substring(0,6);
    String minB = min.substring(7);

    int min11 = min1.length();
    int min22 = min2.length();

    int minP = min.length();

    if(min11 == 6 && min22 == 7) {
      System.out.println("주민번호 앞자리는 " + minA + " 입니다.");
      System.out.println("주민번호 뒷자리는 " + minB + " 입니다.");
    }else {
      System.out.println("잘못된 입력값입니다.");
    }



    //문제1 총자릿수 13자릿수, 14자릿수
    //문제2 ******-1541965
    //문제3 1/3남자 2/4여자 switch다시 기술
    //length(),substirng(),indexof(),charAt()
  }
}
