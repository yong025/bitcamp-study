package com.eomcs.lang.ex04copy;

public class Test06 {
    public static void main(String[] args){
      int[] a = new int[3];//[ ]안에는 총 갯수

      a[0] = 10;// 0부터 2까지 갯수 3개의 주소 할당 가능.
      a[1] = 20;
      a[2] = 30;
      System.out.println(a[0]);

      int[] b = new int[]{10,20,30,40,};//배열 선언 시, 바로 우측에 값 할당 가능.
      System.out.println(b[2]);

      int[] c = {15,25,35};// 한번에 변수 선언 시, new int[] 생략 가능
      System.out.println(c[1]);

      int[] d;//띄어서 배열 변수선언 시, new int[] 생략불가.
      d = new int[]{100,200,300};
      System.out.println(d[0]);
    

      
    }
}

