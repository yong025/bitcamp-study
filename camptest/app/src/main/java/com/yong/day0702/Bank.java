package com.yong.day0702;

public class Bank {
  //자바 언어는 객체지향언어 =OOP=Object Oriented Programming
  //챕터 6장 5 생성자 =Constructor=constr
  //기본 생성자만 기술 => 기본 생성자 생략가능
  //우리은행 거래
  //비번으로 입금, 송금, 계좌이체, 인출, 잔액
  private int pwd=1234;//private키워드는 현재 클래스에만 적용
  Bank() { }

  //챕터6장 4 오버로딩 메소드중복, 생성자중복가능 
  void cal() { System.out.println(pwd); }
  public void cal(int m) { } //입금
  public void cal(String name, int m) { } //어느은행, 입금 
}
