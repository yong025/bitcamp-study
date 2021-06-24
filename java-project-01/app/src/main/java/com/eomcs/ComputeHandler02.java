package com.eomcs;

import java.util.Scanner;

public class ComputeHandler02 implements Handler {

  static Scanner scn;

  public void execute() {
    while(true) {
      System.out.print("계산식: (이전메뉴: back) (ex. 100 * 5)");
      String expression = scn.nextLine();

      if(expression.equals("back")) {
        System.out.println("메뉴로 돌아갑니다.");
        break;
      }

      String[] arr = expression.split(" ");
      if (arr.length != 3) {
        System.out.println("계산식의 입력이 잘못되었습니다.");
        continue;
      }

      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[2]);

      switch (arr[1]) {
        case "+":
          System.out.printf("%d + %d = %d\n", a, b, a + b);
          break;
        case "-":
          System.out.printf("%d - %d = %d\n", a, b, a - b);
          break;
        case "*":
          System.out.printf("%d * %d = %d\n", a, b, a * b);
          break;
        case "/":
          System.out.printf("%d / %d = %d\n", a ,b ,a / b);
          break;
        case "%":
          System.out.printf("%d %% %d = %d\n", a, b, a % b);
          break;
        default:
          System.out.println("이 연산은 지원하지 않습니다.");
      }
    }
  }
}
