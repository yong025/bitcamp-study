package com.eomcs.lang.ex04copy;

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
    // int[] arr4 = new int[Integer.MAX_VALUE - 2];  
    //실행 오류 발생
    //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    //JVM이 OS로부터 사용허가를 받은 메모리 크기를 벗어났기 때문에 발생한 것이다.
    //해결책
    //JVM을 실행할 때 힙(heap) 메모리의 초기 크기를 늘려라.
    //JVM 실행 옵션에 다음을 추가하라 !
    //-Xms메모리크기
    //ex. $java -Xmx20000m -cp...
    //2147483645byte >> 2147MB >> 2.1GB
  }
}


