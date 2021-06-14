package com.eomcs.lang.ex04copy;

//# 문자 변수 - 변수의 메모리 크기
//
public class Test05 {
  public static void main(String[] args) {
int[] a = new int[3];

a[0] = 100;
a[1] = 200;
a[2] = 300;
//주소만 갖고 있고 레퍼런스가 한개도 없다.>>사용불가>> garbage
a = new int[5];
System.out.println(a[0]);
// (값은 두번째 선언한 변수의 첫번째 값인 0이나옴)
// (첫번째 배열은 주소 소실로 사용할 수 없음.)
//JAVM 실행되는 동안 가비지를 찾아 제거하고 재사용한다.
//JVM 종료시 JVM이 사용한 메모리를 OS에 반납한다. 가비지도 반납 

  }
}
