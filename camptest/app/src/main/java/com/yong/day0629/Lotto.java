package com.yong.day0629;

public class Lotto {

  public int[] intput() {
    int[] su = new int[6]; // su배열 지역배열 기술
    su[0]=1; su[1]=4; su[2]=6;
    su[3]=5; su[4]=2; su[5]=8;  
    return su;
  }

  public void output(int[] re) {
    for(int i=0; i <re.length; i++) {
      System.out.print(re[i]+ "\t");
    }
    System.out.println("출력성공");
  }

  public int inputHap() {
    int hap=0;
    int[] su = new int[6]; 
    su[0]=1; su[1]=4; su[2]=6;
    su[3]=5; su[4]=2; su[5]=8;
    for(int i=0; i < su.length; i++) {
      hap += su[i];
    }
    return hap;
  }
}
