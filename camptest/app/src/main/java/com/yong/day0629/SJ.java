package com.yong.day0629;

public class SJ {//make 공급처

  public int getTOTAL(String name,int a,int b) {
    System.out.println(name +"님의 성적합계");
    int hap = a + b;
    return hap;
  }//end

  public double getMean(int value) {
    double avg = (double)value/2;
    //double로 처음부터받아도 되고, 강제 형변환해도 됨
    return avg;
  }

  //  public int getmultiplication(String name,int a, int b) {
  //    System.out.println(name + "곱하기 연습");
  //    int multiple = a * b;
  //    return multiple;
  //  }

  public char getGRADE(double pass) {

    char grade = 'F';

    switch((int)pass/10) { 
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
        grade='F';
        break;
    }
    return grade;
  }

  //  public String getPASS(double pass) {//전체 합격/불합격
  //    String a = "합격";
  //    String b ="불합격";
  //    if(pass >= 80){
  //      return a;
  //    } else {
  //      return b;
  //    }

  //  public String getPASS(double pass) {//전체 합격/불합격
  //    String msg = "합격 여부 안내문";
  //    if(pass >= 80 ) {
  //      msg = "축합격";
  //    } else {
  //      msg = "불합격";
  //    }
  //    return msg;
  //  }

  public String getPASS(double pass, int first, int second) {
    String msg = "합격 여부 안내문";
    if(pass >= 70 && first >= 60 && second >= 60) {
      msg = "축합격";
    } else {
      msg = "불합격";
    }
    return msg;
  }
}//class end

//합계 구하는 함수 hap/sum/total/get total
//평균 구하는 함수 avg/average/mean
//학점 구하는 함수 grade
//합격여부를 구하는 함수 pass/success