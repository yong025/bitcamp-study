package com.eomcs.lang.ex04;

//# 배열 - 배열을 선언하는 방법 
// 배열?
// - 같은 종류의 메모리를 쉽게 만드는 방법
//
// - 문법
//        메모리종류[] 메모리이름 = new 메모리종류[개수]
//        데이터타입[] 변수명 = new 데이터타입[개수];
//        ex) int[] arr = new int[5];
//
// - C언어 스타일 
//        데이터타입 변수명[] = new 데이터타입[개수];
//        ex) int arr[] = new int[5];
//
// 배열의 개수는 int 타입의 최대 값과 같다.
// 즉 2147483647 개 이다. 
//
public class Exam0510 {
  public static void main(String[] args) {
    // 배열 사용 전
    int i1, i2, i3, i4, i5;

    // 배열 선언
    int[] arr1 = new int[5]; // OK!
    int arr2[] = new int[5]; // OK! C-style.

    // 배열의 크기는 int 타입의 최대 값에서 2를 뺀 값이다.
    // 배열의 최대 크기는 Ineger.MAX_VALUE - 2
    // int[] arr3 = new int[2147483647]; //실행 오류 발생
    int[] arr3 = new int[2147483645]; //OK
    int[] arr3 = new int[Integer.MAX_VALUE - 2]; // OK

    //단, 자바 힙 메모리가 부족하다는 실행오류가 발생할 수 있다.
    //JVM을 실행할 때 힙(heap) 메모리의 초기 크기를 늘려라.
  }
}


