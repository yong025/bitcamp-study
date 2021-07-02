package com.yong.day0701;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class aa extends Frame {
  private Button btnExit = new Button("종료");
  private Button btnSend = new Button("보내기");
  private TextField tf = new TextField(20);
  private TextArea  ta = new TextArea();
  private Font ff = new Font("궁서체", Font.BOLD, 20);

  public void Memo() {
    //초간단메모장
    ta.setFont(ff);
    this.add("Center", ta);

    //프레임의 메소드값변경
    this.setSize(400, 550);
    this.setTitle("초간단메모장");
    this.setVisible(true);
  }//end

  public static void main(String[] args) {
    Memo pad = new Memo();
  }//end

}//class END