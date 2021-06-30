package com.yong.day0629;

public class SJUser {// use소비자

  public static void main(String[] args) {


    SJ sj = new SJ();


    String id = "kim";
    int first = 92;
    int second = 69;

    int 합계 = sj.getTOTAL("kim", first, second);
    System.out.println("합계=" + 합계);

    double 평균 = sj.getMean(합계);
    System.out.println("평균=" + 평균);

    char 학점 = sj.getGRADE(평균);
    System.out.println("학점=" + 학점);

    String pass = sj.getPASS(평균, first, second);
    System.out.println("결과=" + pass);//과락도 포함


  }//main end
}//class end
