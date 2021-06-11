package com.eomcs.lang.ex04;

public class Exam0480 {
  public static void main(String[] args) {
    
    char a= '가';
    char b= '공';
    // println()을 통해 문자를 출력할 수 있다.
    //- 변수의 종류가 char 이면 출력할 때 코드 값 대신 문자를 출력한다.  
    System.out.println("a"+"b");
    System.out.println(b);

    //문자의 UCS-2 코드 값을 확인하기
    //- 정수 변수를 사용하면 문자의 코드 값을 받아서 그래도 출력할 수 있다.
    //  println()은 int 변수의 값은 10진수로 출력한다.
    int i = 'A';
    System.out.println(i);
    

  }
}