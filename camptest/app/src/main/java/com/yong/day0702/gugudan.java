package com.yong.day0702;

public class gugudan {

  public static void main(String[] args) {
    for(int i=2; i <= 9; i++) {
      for(int j =1; j <=9; j++) {
        System.out.println(i + "*" + j + "=" + i*j);
      }
    }
    for(int a=0; a < 5; a++) {// 열 밑으로 줄수
      for(int b=0; b <10; b++) {//행 옆으로
        System.out.print("*");
      }
      System.out.println(); //줄바꿈만 함
    }

  }

}
