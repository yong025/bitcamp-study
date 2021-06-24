package com.eomcs;

public class ArrayList02{

  static final int MAX_INT = 100;
  static Object[] list = new Object[MAX_INT];
  static int start = 0;

  static void append(Object obj) {
    list[start++] = obj;
  }

  static Object[] toArray() {
    Object[] arr =new Object[start];
    for(int i = 0; i < start; i++) {
      arr[i] = list[i];
    }
    return arr;
  }

  static Object retrieve(int index) {
    return list[index];
  }

  static void remove(int index) {
    for(int i= index; i < start-1; i++) {
      list[i] = list[i + 1];
    }

    start--;
  }
}

