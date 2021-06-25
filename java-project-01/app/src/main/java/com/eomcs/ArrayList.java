package com.eomcs;

public class ArrayList {

  //배열의 최대 크기를 지정하는 변수는 모든 인스턴스가 같다.
  // => 따라서 각 인스턴스마다 이 변수를 가질 필요는 없다.
  // => 그러니 이 변수는 그냥 클래스 변수로 둔다.
  // => 보통 상수(final) 변수는 클래스 변수(static 변수)로 선언한다.
  static final int MAX_LENGTH = 100; //상수는 보통 대문자와 띄어쓰기는 _로 사용

  //각 인스턴스마다 개별적으로 관리해야 하는 변수는 인스턴스 변수로 선언한다.
  Object[] list = new Object[MAX_LENGTH];//100개의 레퍼런스를 담을 공간
  int size = 0;


  //인스턴스 변수(예: list,size)를 사용하는 메서드는 인스턴스 메서드를 전환한다.
  //인스턴스 메서드는 인스턴스 주소를 받는 this 이름의 레퍼런스를 내장하고 있다.
  void append(Object obj) {// that은 저장소의 개념으로 변수 사용
    this.list[this.size++] = obj;
  }//저장소에 있는 list써라.

  Object[] toArray() {//static을 떼면 인스턴스 메소드라고 선언하는 것과 같다.
    Object[] arr = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      //상단 list가 본래 가지고 있는 배열[MAX_LENGTH]에서 arr이라는 배열을 여기에 새로생성
      //list에 들어있는 값을 arr에 필요한 만큼만 배열 주소를 복사
      arr[i] = this.list[i];
    }
    return arr;
  }

  Object retrieve(int index) {
    return this.list[index];
  }

  void remove(int index) {
    for (int i = index; i < this.size - 1; i++) {
      this.list[i] = this.list[i + 1];
    }

    this.size--;
  }

}
