package com.yong.day0630;

import java.io.InputStream;
import java.util.Scanner;

public class Work02emp {
  public static void main(String[] args) {
    //자바에서 표준입력 ascii코드 byte형태
    //자바에서 표준입력 System.in 키보드입력
    //System.in ; static InputStream in 필드
    //java.util패키지 Scanner생성자 3번째(InputStream)
    //문제 키보드입력 Scanner클래스 반드시 입력해서 출력, 반복문, 예외처리, 형변환
    InputStream is = System.in ;
    Scanner sc = new Scanner(System.in);
    int sabun= 0;
    String name= null;

    while(true) {
      try { 

        System.out.println("사번입력>>> ");
        sabun=Integer.parseInt(sc.nextLine());

        System.out.println("이름입력>>> ");
        name=sc.nextLine(); 

        if(name.equals("") || name.equals(null)) {
          System.out.println("이름데이터 정확히 입력하세요");
          continue;
        }
        break;
      } catch (Exception e) {System.out.println("사번데이터 정확히 입력하세요"); }
    }


    System.out.println();
    System.out.println("사번= " + sabun);
    System.out.println("이름= " + name);
  }
}

//Integer.parseInt(sc.nextLine());
