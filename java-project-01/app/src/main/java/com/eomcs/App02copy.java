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
public class App02copy {

  static class Board{

    String title;
    String content;
    String password;
    int viewCount;
    Date dateCount;
  }

  static final int ARRAY_INT = 3;
  static Board[] boards = new Board[ARRAY_INT];
  static int start = 0;

  static Scanner scn = new Scanner(System.in);

  public static void main(String[] args) {

    System.out.println("[게시판 관리]");


    loop: while(true) {
      System.out.print("명령> ");
      String command = scn.nextLine();

      switch(command) {
        case "list": list(); break;
        case "write": write(); break;
        case "update": update(); break;
        case "view": view(); break;
        case "delete": delete(); break;
        case "quit":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
    }

    scn.close();

    System.out.println("안녕히 가십시오!");
  }


  static void list() {
    System.out.println("[게시글 목록]");

    for(int i =0; i < start; i++) {
      Board board = boards[i];
      System.out.printf("번호: %d,제목: %s, 작성일시: %s, 조회수: %d\n",
          i,
          board.title,
          String.format("%1$tY-%1$tm-%1$td", board.dateCount),
          board.viewCount);
    }
  }static void write() {
    System.out.println("[게시글 작성]");

    if(start == ARRAY_INT) {
      System.out.println("게시글 작성한도 초과");
    }

    Board board = new Board();

    System.out.print("제목: ");
    board.title = scn.nextLine();

    System.out.print("내용: ");
    board.content = scn.nextLine();

    System.out.print("비밀번호: ");
    board.password = scn.nextLine();

    board.dateCount = new Date();

    boards[start++] = board;

    System.out.println("게시글 작성이 완료되었습니다.");


  }

  static void update() {
    System.out.println("[게시글 변경]");
    System.out.print("번호? ");
    int index =Integer.parseInt(scn.nextLine());

    if(index < 0 || index >= start) {
      System.out.println("무효한 게시글입니다.");
    }

    Board board = boards[index];

    System.out.printf("(%s)에서 수정할 제목", board.title);
    String titlechange = scn.nextLine();

    System.out.printf("(%s)에서 수정할 내용", board.content);
    String contentchange = scn.nextLine();
    board.title = titlechange;
    System.out.print("정말 변경하시겠습니까? y/N");
    if(!scn.nextLine().equals("y")) {
      System.out.println("변경을 취소하였습니다.");
      return;
    }
    board.title = titlechange;
    board.content = contentchange;

    System.out.println("변경이 완료되었습니다.");
  }


  static void view() {
    System.out.println("[게시글 조회]");

    System.out.print("번호? ");
    int index =Integer.parseInt(scn.nextLine());

    if(index < 0 || index >= start) {
      System.out.println("무효한 게시글입니다.");
    }

    Board board = boards[index];

    board.viewCount++;

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("조회수: %d\n", board.viewCount);
    System.out.printf("작성 일시: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", board.dateCount);
  }

  static void delete() {
    System.out.println("[게시글 삭제]");

    System.out.print("번호? ");
    int index =Integer.parseInt(scn.nextLine());

    if(index < 0 || index >= start) {
      System.out.println("무효한 게시글입니다.");
    }

    System.out.print("정말 삭제하시겠습니까? y/N");
    if(!scn.nextLine().equals("y")) {
      System.out.println("삭제를 취소하였습니다.");
      return;
    }

    for(int i= index; i < start-1; i++) {
      boards[i] = boards[i + 1];
    }

    start--;
    System.out.println("게시글을 삭제하였습니다.");
  }
}


