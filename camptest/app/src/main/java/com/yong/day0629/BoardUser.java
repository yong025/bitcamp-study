package com.yong.day0629;

public class BoardUser {
  public static void main(String[] args) {
    Board ob =new Board();
    ob.setTitle("6월 장미축제"); //xml문서전달
    String data = ob.getTitle();//java
    //게터/세터 ==> lombok 롬복 연결
    System.out.println( data );//뷰웹화면



  }//end
}//class end
