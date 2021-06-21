package com.eomcs.lang.ex07;

//# 메서드 : 스택 메모리 응용 I
//
public class Exam0440 {

  static int m1(int value) {
    int r1 = m2(value);
    int r2 = m3(value);
    return r1 + r2;//main 메서드로 값을 가지고 회귀 후 소멸.
  }

  static int m2(int value) {
    return value + 100;// m1메서드의 r1으로 값을 가지고 회귀 후 m2메서드 소멸.
  }

  static int m3(int value) {
    return value + 200;//m1메서드의 r2로 값을 가지고 회귀 후 m3메서드 소멸.
  }

  public static void main(String[] args) {
    int r = m1(5);//최종적으로 r1 + r2값을 리턴받음.
    System.out.println(r);
  }
}
// JVM Stack 메모리의 사용
// 0) 시작
// 1) main()
// 2) main() => m1()
// 3) main() => m1() => m2()
// 4) main() => m1()
// 5) main() => m1() => m3()
// 6) main() => m1()
// 7) main()
// 8) 종료!