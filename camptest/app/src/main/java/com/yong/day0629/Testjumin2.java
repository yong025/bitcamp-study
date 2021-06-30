package com.yong.day0629;

public class Testjumin2 {

  public static void main(String[] args) {
    //java.lang패키지 String클래스의 메소드 char chatat(int)
    String min = "871024-1541965";

    char gender = min.charAt(7);
    //    System.out.println(gender);

    switch(gender) {
      case '1' :
        System.out.println("남자입니다.");
        break;
      case '2':
        System.out.println("여자입니다.");
        break;
      case'3':
        System.out.println("남자입니다.");
        break;
      case'4' :
        System.out.println("여자입니다.");
        break;
      default:
        System.out.println("잘못된 번호입니다");
        break;
    }
  }
}


//    if(gender == '1') {
//      System.out.println("남자입니다.");
//    } else {
//      System.out.println("여자입니다.");
//    }

//조건 if
//String문자열은 0번째부터 시작
//String 클래스의 메소드 char chatAt (int)

