package com.eomcs.lang.ex04copy;

//# 문자 변수 - 변수의 메모리 크기
//
public class Test04 {
  public static void main(String[] args) {
    //배열 메모리의 시작 주소를 저장한 레퍼런스 선언
    int[] a;//주소가 담길 변수

    // 레퍼런스 변수에 배열 메모리 주소를 준다.
    a = new int[3]; // int[] a = new int[3]; 과 같음.

    a[0] = 100;
    a[1] = 200;
    a[2] = 300;
    // a[3] = 400; 없는 값을 넣으면 컴파일 오류 발생.
    //ArrayIndexOutOfBoundsException 오류

    System.out.println(a[0]);
    System.out.println(a[1]);
    System.out.println(a[2]);
    // System.out.println(a[3]); 물론 없는 방번호의 주소를 넣을 수 없다.

    int[] b;
    b = a; //a의 배열 주소를 b에 대입한다.
    System.out.println(b[0]);
  }
}
