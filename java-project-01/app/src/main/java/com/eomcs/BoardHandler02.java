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

  String boardName;
  Scanner scn;
  ArrayList02 boardList = new ArrayList02();

  //생성자
  BoardHandler02(String boardName, Scanner scn){
    this.boardName = boardName;
    this.scn = scn;
  }

  public void execute() {
    loop: while(true) {
      System.out.print(this.boardName + "게시글 관리> ");
      String command = scn.nextLine();

      switch(command) {
        case "list": this.list(); break;
        case "write": this.write(); break;
        case "update": this.update(); break;
        case "view": this.view(); break;
        case "delete": this.delete(); break;
        case "back":
          System.out.println("메뉴로 돌아갑니다.");
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println();
    }
  }

  void list() {
    System.out.println("[게시글 목록]");


    Object[] arr = this.boardList.toArray();
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

  void write() {
    System.out.println("[게시글 작성]");

    if(this.boardList.start == ArrayList02.MAX_INT) {
      System.out.println("게시글 작성한도 초과");
      return;
    }

    Board board = new Board();

    System.out.print("제목: ");
    board.title = this.scn.nextLine();

    System.out.print("내용: ");
    board.content = this.scn.nextLine();

    System.out.print("비밀번호: ");
    board.password = this.scn.nextLine();

    board.dateCount = new Date();

    this.boardList.append(board);

    System.out.println("게시글 작성이 완료되었습니다.");
  }

  void update() {
    System.out.println("[게시글 변경]");

    System.out.print("번호? ");
    int index =Integer.parseInt(this.scn.nextLine());

    if(index < 0 || index >= this.boardList.start) {
      System.out.println("무효한 게시글입니다.");
      return;
    }

    Board board = (Board) this.boardList.retrieve( index);

    System.out.printf("(%s)에서 수정할 제목", board.title);
    String titlechange = this.scn.nextLine();

    System.out.printf("(%s)에서 수정할 내용", board.content);
    String contentchange = this.scn.nextLine();

    System.out.print("정말 변경하시겠습니까? y/N");
    if(!this.scn.nextLine().equals("y")) {
      System.out.println("변경을 취소하였습니다.");
      return;
    }

    board.title = titlechange;
    board.content = contentchange;

    System.out.println("변경이 완료되었습니다.");
  }
  void delete() {
    System.out.println("[게시글 삭제]");

    System.out.print("번호? ");
    int index =Integer.parseInt(this.scn.nextLine());

    if(index < 0 || index >= this.boardList.start) {
      System.out.println("무효한 게시글입니다.");
      return;
    }

    System.out.print("정말 삭제하시겠습니까? y/N");
    if(!this.scn.nextLine().equals("y")) {
      System.out.println("삭제를 취소하였습니다.");
      return;
    }

    this.boardList.remove( index);

    System.out.println("게시글을 삭제하였습니다.");
  }
  void view() {
    System.out.println("[게시글 조회]");

    System.out.print("번호? ");
    int index =Integer.parseInt(this.scn.nextLine());

    if(index < 0 || index >= this.boardList.start) {
      System.out.println("무효한 게시글입니다.");
      return;
    }

    Board board = (Board) this.boardList.retrieve(index);

    board.viewCount++;

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("조회수: %d\n", board.viewCount);
    System.out.printf("작성 일시: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", board.dateCount);
  }
}