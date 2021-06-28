package com.yong.day0628;

public class TestException3 {
  public static void main(String[] args) {

    int su1 = 9;
    int su2 = 0;
    int mul=0, mok=0;

    mul = su1*su2 ;
    mok = su1/su2 ; //실행중에 에러발생  try{ }catch(Exception ex) { }
    System.out.println(su1 + " * " + su2 + "=" + mul);
    System.out.println(su1 + " / " + su2 + "=" + mok);

    //    boolean[] camp = new boolean[5]; 
    //    System.out.println(camp[11]);
    //    System.out.println(camp[4]);

    System.out.println("\n***까사노 점수***");
    System.out.println("국어=90");
    System.out.println("영어=85");
    System.out.println("총점=175");
  }//end
}//TestException2 class END

