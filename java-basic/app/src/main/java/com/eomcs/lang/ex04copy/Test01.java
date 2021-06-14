package com.eomcs.lang.ex04copy;

//# 문자 변수 - 변수의 메모리 크기
//
public class Test01 {
  public static void main(String[] args) {
    char c;// unicode 문자코드(0~65535)를 저장하는 변수

    c = 0x0041; // A
    System.out.println(c); 
    // c 변수에 저장된 문자코드를 println()에 전달하면
    // println() 명령은 그 문자 코드에 해당하는 폰트를 찾아 화면에 출력한다.
    
    c = 0x41; //숫자 앞의 00은 생략해도 된다.
     System.out.println(c); 
    c =65; // A 문자의 유니코드를 10진수로 표현해도 된다.

    c = '헐'; 
    //D5D0
    //한글 '헐'의 유니코드 값을 c변수에 저장한 후 출력한다.
    System.out.println(c);

    c = 0xd5d0;
     System.out.println(c); 
  }
}
