package com.eomcs.lang.ex05;

//# 조건 연산자 => ? :
//

// 용어정리: Statement 와 Expression

// int a; << statement
// if (-) { } << statement
// a + 2 << statement
// (a+2처럼 실행결과를 생성(리턴)하는 statement(문장)는 Expression(표현식)이라고 한다.)
// statement = 명령문
// expression = 결과를 리턴하는 명령문
public class Exam0510 {
  public static void main(String[] args) {
    // 조건연산자
    // => 조건 ? 표현식1 : 표현식2
    // => 조건이 참이면 표현식1(결과)을 실행하고,
    //    조건이 거짓이면 표현식2(결과)를 실행한다.
    int age = 20;
    
    /*
    (age > 18) ? System.out.println("성인이다.") : 
                     System.out.println("미성년자이다.");  //컴파일 오류!
    */
    // 표현식 자리에는 문자가 되었든 숫자가 되었든 
    // 실행 결과가 놓여져야 한다.
    // 위의 System.out.println(...) 문장은 결과를 리턴하지 않는다.
    //System.out.println(...) 는 단순 출력하는 문장.
    // 그래서 컴파일 오류이다.

    String message = (age > 18) ? "성년" : "미성년";
    System.out.printf("나이 %d는(은) %s이다.\n", age, message);
  }
}

// 표현식(expression)?
// - 작업을 수행한 후 결과를 리턴하는 명령이다.
//
// 문장(statement)?
// - 작업을 수행시키는 명령어이다.
//
// 문장과 표현식의 관계
// - statement 중에서 결과를 리턴하는 statement를 expression이라 부른다.
//








