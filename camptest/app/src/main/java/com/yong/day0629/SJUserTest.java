package com.yong.day0629;

public class SJUserTest {// use소비자

  public static void main(String[] args) {

    SJTest sjj = new SJTest();

    String id = "김용환";
    int kor = 95;
    int eng = 90;
    int total = sjj.getTOTAL(id, kor, eng);
    System.out.println(total);

    int avg = sjj.getAVG(total);
    System.out.println(avg);

    char grade = sjj.getGRADE( avg);
    System.out.println(grade);

    String pass = sjj.getPASS(avg, kor, eng);
    System.out.println(pass);

    //합계 구하기 totla / sum ..
    //평균 구하기  avg 
    //학점 구하기 grade
    //합격 불합격 구하기 pass
  }//main end
}//class end
