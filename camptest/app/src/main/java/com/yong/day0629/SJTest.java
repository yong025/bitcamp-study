package com.yong.day0629;

public class SJTest {


  public int getTOTAL(String id, int kor, int eng) {
    int sum = kor + eng;
    return sum;
  }

  public int getAVG(int total) {
    int avg = total/2;
    return avg;
  }

  public char getGRADE(int score) {
    char grade = 'F';

    switch(score/10) {
      case 10:
        grade = 'A';
        break;
      case 9:
        grade = 'B';
        break;
      case 8:
        grade = 'C';
        break;
      case 7:
        grade = 'D';
        break;
      default:
        grade = 'F';
        break;
    }
    return grade;
  }

  public String getPASS(int avg, int kor, int eng) {
    String msg = "합격 통지서";

    if(avg >= 80 && kor >=60 && eng >= 60) {
      msg = "합격";
    } else {
      msg =  "불합격";
    }
    return msg;
  }
}
