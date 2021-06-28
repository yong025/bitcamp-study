package com.eomcs;

public class ArrayList02{

  static final int MAX_INT = 100;

  Object[] list = new Object[MAX_INT];
  int start = 0;

  void append(Object obj) {
    this.list[this.start++] = obj;
  }

  Object[] toArray() {
    Object[] arr =new Object[this.start];
    for(int i = 0; i < this.start; i++) {
      arr[i] = this.list[i];
    }
    return arr;
  }

  Object retrieve(int index) {
    return this.list[index];
  }

  void remove(int index) {
    for(int i= index; i < this.start-1; i++) {
      this.list[i] = this.list[i + 1];
    }

    this.start--;
  }
}

