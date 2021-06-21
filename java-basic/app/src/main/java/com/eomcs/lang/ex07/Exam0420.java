package com.eomcs.lang.ex07;

//# 메서드 : Heap 메모리 영역
//
public class Exam0420 {

  static int[] getArray() {
    int[] arr = new int[] {100, 200, 300};// main 메서드 getArray에 호출당하는 내용
    // Heap(배열 인스턴스)
    return arr;//arr 배열 주소값을 가지고 다시 main으로 회귀.
  }

  public static void main(String[] args) {//JVM Stack 메서드 호출할 때마다 생성하는 로컬변수
    int[] arr;
    arr = getArray();//여기서 Method 정의 호출
    System.out.println(arr[1]); // 200
  }
}

// 1) main() 호출
//    => JVM Stack: args, arr 변수 생성
// 2) getArray() 호출
//    => JVM Stack: arr 변수 생성
//    => Heap: new int[] 배열 생성
// 3) getArray() 호출 끝
//    => JVM Stack: getArray() 관련 메모리(arr 변수) 제거
//    => new int[] 배열 주소 리턴
// 4) main() 호출 끝
//    => JVM Stack: main() 관련 메모리 제거 
// 5) JVM 종료
//    => JVM이 사용한 모든 메모리(Method Area, JVM Stack, Heap 등)를 OS 반납.