package com.eomcs.lang.ex04;

// eomcs-java EX04 Exam0493.java
//# 레퍼런스 변수
//
public class Exam0493 {
  public static void main(String[] args) {
    // 배열 사용 전
    int i1, i2, i3, i4, i5;

    // 배열 선언
    int[] arr1 = new int[5]; // OK!
    // int arr2[] = new int[5]; // OK! C언어-style.

    // 배열의 크기는 int 타입의 최대 값이다.
    int[] arr3 = new int[2147483647];
  }
}
