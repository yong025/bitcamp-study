package com.yong.day0629;

public class LottoTest {

  public int[] input() {
    int[] k = new int[6];
    k[0]=1; k[1]=2; k[2]= 3;
    k[3]=4; k[4]=5; k[5]=6;

    return k;
  }

  public void output(int[] rot) {
    for(int i=0; i < rot.length; i++) {
      System.out.println(rot[i]+ "\t");
    }
  }
  public int inputHap() {
    int hap =0;
    int[] k = {1,2,3,4,5,6};
    //    k[0]=1; k[1]=2; k[2]= 3;
    //    k[3]=4; k[4]=5; k[5]=6;
    for(int i=0; i < k.length; i++) {
      hap += k[i];
    }

    return hap;

  }


}
