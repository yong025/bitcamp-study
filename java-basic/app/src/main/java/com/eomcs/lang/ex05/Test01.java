package com.eomcs.lang.ex05;

//# 비트 연산자 : 응용 II
//
public class Test01 {
  public static void main(String[] args) {
    int lang2 = 0;
    // 00000000 00000000 00000000 00000000

    // 32비트에서 뒤에 8비트를 사용하여 8개의 true/false 값을 저장할 수 있다.
    // 8 비트에서 각 언어에 값을 저장할 비트를 다음과 같다고 가정하자.
    // 00000000
    // ||||||||- css 
    // |||||||- html 00000010
    // ||||||- php
    // |||||- python ex. 00001000
    // ||||- javascript
    // |||- java
    // ||- c++
    // |- c
    
    final int LANG_C       = 0B10000000; // 0x80
    final int LANG_CPP     = 0B01000000; // 0x40
    final int LANG_JAVA    = 0B00100000; // 0x20
    final int LANG_JS      = 0B00010000; // 0x10
    final int LANG_PYTHON  = 0B00001000; // 0x08
    final int LANG_PHP     = 0B00000100; // 0x04
    final int LANG_HTML    = 0B00000010; // 0x02
    final int LANG_CSS     = 0B00000001; // 0x01
     //final로 상수 지정 (변동 x) 
     //

    lang2 |= LANG_C;  //lang2 = lang2 | LANG_C;
    lang2 |= LANG_JAVA; 
    lang2 |= LANG_PYTHON;
    lang2 |= LANG_HTML;
    System.out.println(Integer.toBinaryString(lang2));
    lang2 = LANG_C | LANG_JAVA | LANG_PYTHON | LANG_HTML;
    System.out.println(Integer.toBinaryString(lang2));
    lang2 = lang2 - LANG_JAVA;//lang2에서 자바를 빼면 10001010으로 출력
      System.out.println(Integer.toBinaryString(lang2));


  }
}
