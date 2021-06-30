package com.yong.day0629;

public class Testjumin {

  public static void main(String[] args) {
    // String클래스의 메소드 char chatat(int)
    // String클래스의 메소드 int indexof(int/String)
    //indexof()는 위치 뽑아내기
    // String클래스의 메소드 String substring(1시작,2끝-1)
    // String클래스의 메소드 String substring(1시작) 시작부터 끝까지
    String min = "871024-1541965";
    int pos = min.indexOf("-");
    System.out.println("pos=" + pos);
    //10월 24일 생일이네요
    String month = min.substring(2, 4);//"안 0부터 시작해서 카운팅
    String day = min.substring(4, 6);
    System.out.println(month + "월" + day + "일 생일이네요");

    String last = min.substring(7);
    System.out.println(last);//int형 출력 x

    int len = min.length();
    System.out.println("총자릿수= " + len);
  }
}


/*
 *   public static void main(String[] args) {
    //java.lang패키지 String클래스의 메소드 char charat(int)
    String min = "871024-1541965";

    char gender = min.charAt(7);
    System.out.println(gender);

    if(gender == '1') {
      System.out.println("남자입니다.");
    } else {
      System.out.println("여자입니다.");
    }

    //조건 if
    //String문자열은 0번째부터 시작
    //String 클래스의 메소드 char chatAt (int)
  }
}
 * 
 */
