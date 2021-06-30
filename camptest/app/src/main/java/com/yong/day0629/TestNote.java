package com.yong.day0629;

public class TestNote {

  public static void main(String[] args) {
    //자바 단독으로 실행할 수 있도록 도와주는게 main
    //규칙은 static과 String[] 배열이 들어가야 함.
    System.out.println("김용환 9:42");
    System.out.println("방방방 9:43");
    TestNote tn = new TestNote();
    tn.note();

    //    tn.note();
  }

  public String book() {
    String my = "몽블랑"; //지역 변수 (loval variable)=어린아이=철저하게 보호
    return my;
  }

  public int price() {//리턴값 int 이기 때문에 int price
    int money = 2700;
    return money;
  }

  public void note() {// Non static 메소드
    int mn = price();//price()메소드 호출
    String title = book();
    System.out.println("책 제목 = " + title);
    System.out.println("책 제목 = " + book());
    System.out.println("책 제목 = " + mn);//메소드값 입력
  }
}