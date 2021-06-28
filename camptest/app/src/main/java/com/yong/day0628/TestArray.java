package com.yong.day0628;

public class TestArray {

  public static void main(String[] args) {
    //배열의 초기화
    //배열의 장단점
    String[] dong = new String[5];
    for(int i=0; i<dong.length; i++) {
      System.out.print(dong[i] + " ");
    }
    System.out.println();

    boolean[] camp = new boolean[5];
    for(int i=0; i<camp.length; i++) {
      System.out.print(camp[i] + " ");
    }
    System.out.println();

    double[] pi = new double[5];
    for(int i=0; i<pi.length; i++) {
      System.out.print(pi[i] + " ");
    }
    System.out.println();
    //배열은 같은 타입으로만 구성, 크기 사이즈 고정
    //채팅 구성원 정보 닉네임String, 나이int, 성별boolean => 배열 구성비 권장
    //웹web게시판 구성원 정보 글쓴이, 제목, 이미지, 조회수, 날짜
    //채팅, 채팅메세지, 쇼핑몰, 게시판 구성할 때 배열의 한계극복 collection모음 List계열
    //java.util패키지 List인터페이스 상속 - ArrayList 클래스, vector 클래스
    //java.util패키지 Map인터페이스, set인터페이스, List인터페이스(ArrayList의 부모개념)
    //같은타입구성, 크기고정인 배열의 단점을 List인터페이스 상속
    //같은타입구성, 크기고정인 1차원 배열
    //boolean[] camp = new boolean[5];
    //배열 및 문자열 시작위치 0번째부터입니다.
    //자바에서 표준출력 모니터 System.out => print
    //자바에서 표준입력 키보드 System.out => Scanner클래스

  }
}