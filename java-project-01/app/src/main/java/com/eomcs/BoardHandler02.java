package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class BoardHandler02 implements Handler02{

  static class Board{

    String title;
    String content;
    String password;
    int viewCount;
    Date dateCount;
  }

  static Scanner scn;

  public void execute() {
    loop: while(true) {
      System.out.print("게시글 관리> ");
      String command = scn.nextLine();

      switch(command) {
        case "list": BoardHandler02.list(); break;
        case "write": BoardHandler02.write(); break;
        case "update": BoardHandler02.update(); break;
        case "view": BoardHandler02.view(); break;
        case "delete": BoardHandler02.delete(); break;
        case "back":
          System.out.println("메뉴로 돌아갑니다.");
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println();
    }
  }

  static void list() {
    System.out.println("[게시글 목록]");


    Object[] arr = ArrayList.toArray();
    int i = 0;
    for(Object item : arr) {
      Board board = (Board) item;
      System.out.printf("번호: %d,제목: %s, 작성일시: %s, 조회수: %d\n",
          i++,
          board.title,
          String.format("%1$tY-%1$tm-%1$td", board.dateCount),
          board.viewCount);
    }
  }

  static void write() {
    System.out.println("[게시글 작성]");

    if(ArrayList02.start == ArrayList02.MAX_INT) {
      System.out.println("게시글 작성한도 초과");
      return;
    }

    Board board = new Board();

    System.out.print("제목: ");
    board.title = scn.nextLine();

    System.out.print("내용: ");
    board.content = scn.nextLine();

    System.out.print("비밀번호: ");
    board.password = scn.nextLine();

    board.dateCount = new Date();

    ArrayList.append(board);

    System.out.println("게시글 작성이 완료되었습니다.");
  }

  static void update() {
    System.out.println("[게시글 변경]");

    System.out.print("번호? ");
    int index =Integer.parseInt(scn.nextLine());

    if(index < 0 || index >= ArrayList02.start) {
      System.out.println("무효한 게시글입니다.");
      return;
    }

    Board board = (Board) ArrayList02.retrieve(index);

    System.out.printf("(%s)에서 수정할 제목", board.title);
    String titlechange = scn.nextLine();

    System.out.printf("(%s)에서 수정할 내용", board.content);
    String contentchange = scn.nextLine();

    System.out.print("정말 변경하시겠습니까? y/N");
    if(!scn.nextLine().equals("y")) {
      System.out.println("변경을 취소하였습니다.");
      return;
    }

    board.title = titlechange;
    board.content = contentchange;

    System.out.println("변경이 완료되었습니다.");
  }
  static void delete() {
    System.out.println("[게시글 삭제]");

    System.out.print("번호? ");
    int index =Integer.parseInt(scn.nextLine());

    if(index < 0 || index >= ArrayList02.start) {
      System.out.println("무효한 게시글입니다.");
      return;
    }

    System.out.print("정말 삭제하시겠습니까? y/N");
    if(!scn.nextLine().equals("y")) {
      System.out.println("삭제를 취소하였습니다.");
      return;
    }

    ArrayList.remove(index);

    System.out.println("게시글을 삭제하였습니다.");
  }
  static void view() {
    System.out.println("[게시글 조회]");

    System.out.print("번호? ");
    int index =Integer.parseInt(scn.nextLine());

    if(index < 0 || index >= ArrayList02.start) {
      System.out.println("무효한 게시글입니다.");
      return;
    }

    Board board = (Board) ArrayList.retrieve(index);

    board.viewCount++;

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("조회수: %d\n", board.viewCount);
    System.out.printf("작성 일시: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", board.dateCount);
  }
}