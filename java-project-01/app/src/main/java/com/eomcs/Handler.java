package com.eomcs;

//메뉴를 처리할 클래스가 반드시 만들어야 하는 메서드의 시그니처를 정한다.
interface Handler {
  void execute(); //규칙이기 때문에 메서드 바디{}가 있으면 안됨. 
}
