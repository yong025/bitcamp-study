package com.yong.day0629;

public class LottoUserTest {

  public static void main(String[] args) {

    LottoTest lottetest = new LottoTest(); 

    int[] rot = lottetest.input();//출력의 목적이 없음.
    lottetest.output(rot);

    int value = lottetest.inputHap();//계산만 함
    System.out.println("숫자 합계=" + value);
    System.out.println("숫자 합계=" + lottetest.inputHap());


    System.out.println();
    System.out.println("LottoUser.java 10:08 11:00");
    //리턴값을 안받으면 그냥 호출,에러는 없지만 의미 없음
  }
}