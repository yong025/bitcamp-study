package com.eomcs.lang.ex05;

//# 증감 연산자 : 후위(post-fix) 증감 연산자 응용 I
//
public class Exam0631 {
  public static void main(String[] args) {
    int i = 7;
    //int temp = i; 임시 메모리 생성
    //i = i + 1;
    //i = temp값 ;

    i = i++; //이자리에는 i변수의 현재 값을 넣는다.
    //(i = 7) 
    //(7 = 8)
    //(i=7)마지막할당연산자 실행 왼쪽에 맞춰 i는 7이 되야함
    
    
    // 1) i 값을 그자리에 놓는다.
    //    => i = 7;
    //    => 7 값을 i에 저장할 수 없다.
    //    => 왜? 아직 = 연산자 오른쪽의 모든 식이 수행되지 않는다.
    // 2) ++ 연산 실행
    //    => 즉 i = i + 1 실행
    //    => i = 8 이 되었다.
    // 3) 할당 연산자 실행 오른쪽 식이 모두 완료되어야 왼쪽변수가 완료.
    //    => i <===== 7 실행
    //    => 다시 i는 8에서 7로 바뀌었다.
    //요약
    //int temp = i; 임시 메모리 생성
    //i = i + 1;
    //i = temp값 ;

    System.out.println(i);

  }
}
