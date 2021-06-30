package com.yong.day0629;

public class LottoUser {

  public static void main(String[] args) {
    Lotto my = new Lotto();
    int[] ret = my.intput();//출력의 목적이 없음.
    my.output(ret);

    int value = my.inputHap();//계산만 함
    System.out.println("숫자 합계=" + value);
    System.out.println("숫자 합계=" + my.inputHap());

    System.out.println();
    System.out.println("LottoUser.java 10:08 11:00");
    //리턴값을 안받으면 그냥 호출,에러는 없지만 의미 없음
  }
}