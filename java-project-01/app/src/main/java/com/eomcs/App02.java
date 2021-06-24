package com.eomcs;

import java.util.Date;
import java.util.Scanner;

//01. main() : 프로그램의 entry point
//02. 사용자로부터 명령어 입력받기
//03. 사용자로부터 계속 명령어 입력받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
//06. 게시글 입력받기
//07. 배열을 이용하여 여러개의 게시글 보관하기
//08. 상수(final 변수)를 이용하여 배열의 크기를 다루기
//09. 게시글 목록 출력하기
//10. 게시글 상세 조회
//11. 게시글 조회수 추가하기
//12. 게시글 등록일 추가하기
//13. 게시글 변경하기
//14. 게시글 삭제하기
//15. 메서드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터 타입 정의하기
public class App02 {

  static class Board{

    String title;
    String content;
    String password;
    int viewCount;
    Date dateCount;
  }

  static Scanner scn = new Scanner(System.in);

  public static void main(String[] args) {

    BoardHandler02.scn = scn;

    System.out.println("[게시판 관리]");

    loop: while(true) {
      System.out.print("명령> ");
      String command = scn.nextLine();

      switch(command) {
        case "list": BoardHandler02.list(); break;
        case "write": BoardHandler02.write(); break;
        case "update": BoardHandler02.update(); break;
        case "view": BoardHandler02.view(); break;
        case "delete": BoardHandler02.delete(); break;
        case "quit":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
    }

    scn.close();

    System.out.println("안녕히 가십시오!");
  }
}


