package com.yong.day0702;

public class A001 {

  public static void main(String[] args) {
    int kor = 90, eng=85, hap=0;
    double avg = 0.0;
    String info = "합격여부";
    hap=kor+eng;
    avg=(double)hap/2;
    //평균점수 70점 합격 0~69까지 재시험

    if( avg>=70) { info = "축합격"; }
    else { info = "재시험"; }

    info = (avg > 70) ? "pass" : "failed" ;
    System.out.println("결과 = " + info);

  }

}
