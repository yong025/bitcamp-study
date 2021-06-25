package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class BoardHandler implements Handler {//임플리먼트와 규칙이름 붙어야 함.

  // 게시글에 담을 변수 지정
  static class Board {
    String title; //아직 실제 변수 존재x 변수를 만들기위한 설계도
    String content;
    String password;
    int viewCount;
    Date createdDate;
  }

  // 게시판을 구분하기 위해 게시판 이름을 저장할 인스턴스 변수를 준비한다.
  String boardName;
  Scanner keyScan;
  // BoardHandler에서 사용할 ArrayList 인스턴스를 준비한다.
  ArrayList boardList = new ArrayList();

  //생성자
  // => 인트섵스를 생성할 때 반드시 호출해야 하는 메서드
  // => 메서드명은 클래스 이름과 같아야 한다.
  // => 리턴 타입은 지정하지 말아야 한다.
  // => 인스턴스를 생성할 때 반드시 설정해야 하는 값은 파라미터로 받는다.
  BoardHandler(String boardName, Scanner keyScan){
    this.boardName = boardName;
    this.keyScan = keyScan;
  }

  public void execute() {
    loop: while(true) {
      System.out.print(this.boardName + "/게시글 관리> ");
      String command = keyScan.nextLine();

      switch (command) {
        case "list": this.list(); break;
        case "add" : this.add();break;
        case "update": this.update();break;
        case "delete" : delete(); break;
        case "view" : view(); break;
        case "back" :
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
      }
      System.out.println();//줄 띄움
    }
  } 

  void list() {
    System.out.println("[게시물 목록]");


    Object[] arr = this.boardList.toArray();
    //    Object[] arr = ArrayList.toArray(boardList);
    int i = 0;
    for(Object item : arr) { // i는 로컬변수
      Board board = (Board) item;
      System.out.printf("%d, %s, %s, %d\n",
          i,
          board.title,
          String.format("%1$tY-%1$tm-%1$td", board.createdDate), 
          board.viewCount);
      i++;
      //처음 bards[0]의 주소에 있는 값을 출력 후 차례대로 [1][2]에 있는 값 출력
    }
  }

  void add() {
    System.out.println("[게시글 등록]");

    if( this.boardList.size == ArrayList.MAX_LENGTH) {
      System.out.println("더 이상 게시글을 작성할 수 없습니다.");
      return;
    }


    //한개의 게시글 데이터를 저장할 변수를 준비한다.
    Board board = new Board(); // Board 설계도에 따라 변수를 만들고 그 주소를 리턴한다.

    System.out.print("제목: ");
    board.title = this.keyScan.nextLine();

    System.out.print("내용: ");
    board.content = this.keyScan.nextLine();

    System.out.print("비밀번호: ");
    board.password = this.keyScan.nextLine();

    board.createdDate = new Date(); 

    boardList.append(board);

    System.out.println("게시글을 등록했습니다.");

  }

  void update() {
    System.out.println("[게시물 변경]");

    System.out.print("번호? ");
    int index = Integer.parseInt(this.keyScan.nextLine());

    if (index < 0 || index >= boardList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = (Board) boardList.retrieve(index);

    System.out.printf("제목(%s)? ", board.title);
    String title = this.keyScan.nextLine();

    System.out.printf("내용(%s)? ", board.content);
    String content = this.keyScan.nextLine();

    System.out.print("정말 변경하시겠습니까?(y/N) ");
    if (!this.keyScan.nextLine().equals("y")) {
      System.out.println("게시글 변경을 최소하였습니다.");
      return;
    } 

    board.title = title;
    board.content = content;

    System.out.println("게시글을 변경하였습니다.");
  }

  void delete() {
    System.out.println("[게시글 삭제]");

    System.out.print("번호? ");
    int index = Integer.parseInt(this.keyScan.nextLine());

    if(index < 0 || index >= boardList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }
    System.out.print("정말 삭제하시겠습니까?(y/N) ");
    if (!this.keyScan.nextLine().equals("y")) {
      System.out.println("게시글 삭제를 취소하였습니다.");
      return;
    } 

    this.boardList.remove(index);

    System.out.println("게시글을 삭제하였습니다.");
  }

  void view() {
    System.out.println("[게시글 조회]");

    System.out.print("번호? ");
    int index = Integer.parseInt(this.keyScan.nextLine());

    if(index < 0 || index >= this.boardList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = (Board) this.boardList.retrieve(index);

    board.viewCount++;

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("조회수: %s\n", board.viewCount);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td %1$tH:%1tM:%1$tS\n", board.createdDate);
  }
}

