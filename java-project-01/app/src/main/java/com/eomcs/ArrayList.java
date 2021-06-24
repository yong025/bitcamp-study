package com.eomcs;

import com.eomcs.App.Board;

public class ArrayList {

  static final int MAX_LENGTH = 100; //상수는 보통 대문자와 띄어쓰기는 _로 사용
  static Object[] list = new Board[MAX_LENGTH];//100개의 레퍼런스를 담을 공간
  static int size = 0;

  static void append(Object obj) {
    list[size++] = obj;
  }

  static Object[] toArray() {
    Object[] arr = new Object[size];
    for (int i = 0; i < size; i++) {
      //상단 list가 본래 가지고 있는 배열[MAX_LENGTH]에서 arr이라는 배열을 여기에 새로생성
      //list에 들어있는 값을 arr에 필요한 만큼만 배열 주소를 복사
      arr[i] = list[i];
    }
    return arr;
  }

  static Object retrieve(int index) {
    return list[index];
  }

  static void remove(int index) {
    for (int i = index; i < size - 1; i++) {
      list[i] = list[i + 1];
    }

    size--;
  }

}
