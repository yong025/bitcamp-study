package com.yong.yong0712;

import java.util.Scanner;

public class Boardtest {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    Review rv = new Review();
    DB db = new DB();
    int cd = sc.nextInt();
    db.DBbase();
    while(true) {

      switch(cd) {
        case 1:rv.select();
        case 2: rv.update();
        case 3:rv.insert();
        case 4:rv.Delete();
        default:
          System.out.println("xxxxxxxxxx");
      }
    }




    //    rv.insert();

  }

}
