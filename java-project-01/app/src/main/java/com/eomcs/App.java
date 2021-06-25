package com.eomcs;

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
//17. 클래스를 이용하여 메서드를 분류하기
//18. 데이터 목록을 다루는 코드를 재사용하기 쉽게 별도의 클래스로 분리한다.
//19. 메뉴 선택 기능을 추가
//20. 리팩토링: 메서드 추출 => 게시글 관리 메뉴 처리 코드를 별도의 메서드로 분리한다.
//21. 리팩토링
//    - 메서드 이동 => 게시글을 다루는 일은 BoardHandler에게 맡긴다.
//    - 클래스 이동 =>BoardHandler클래스를 사용하는 BoardHandler로 옮긴다.
//22. 메뉴 추가하기
//    - 회원 관리 기능을 추가하기(미완성)
//    - 계산기 기능 추가하기(완성)
//23. 메뉴를 실행하는 핸들러의 사용 규칙을 통일하기 : 인터페이스 문법의 용도
//    - 규칙 정의 : Handler
//    - 규칙을 이행(implements) : BoardHandler, MemberHandler, ComputeHandler
//24. 회원관리 기능 완성하기
//    - 회원 정보를 담을 데이터 타입을 새로 설계한다. => Member
//    - 회원 등록, 목록 조회, 상세 조회, 변경, 삭제 기능을 구현한다.
//    - 게시글과 회원 데이터를 함께 보관할 때 문제점 확인하기
//25. 회원 데이터를 별도의 목록으로 관리하기 (단순한 방법 = 유지보수가 어렵다)
//    - 기존의 ArrayList 클래스를 복사하여 ArrayList2로 만들어 사용한다.
//(ArrayList 복사해ArrayList2생성)
//MemberHandler에서 ctrl+f 후에 ArrayList를 ArrayList2로 변경)
//26. 인스턴스 변수로 배열을 관리하기
//    - ArrayList2.java는 삭제한다.
//    - ArrayList2.java의 변수를 인스턴스 변수로 전환한다. 
//    - 메서드에서 작업할 때 사용하는 변수의 주소(인스턴스 주소)를 파라미터로 받는다.
//    - BoardHandler.java와 MemberHandler.java 변경
//       - 각 핸들러가 사용할 ArrayList의 인스턴스를 따로 생성한다.
//       - ArrayList의 메서드에서 인스턴스 변수를 사용할 수 있도록 인스턴스 주소를 받는 파라미터를

public class App {
  //static 변수는 Method area에 만들어진다.

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {

    //APP 클래스에서 만든 Scanner 인스턴스를 BoardHandler와 MemberHandler과 같이 쓴다.

    //규칙에 따라 만든 클래스에 대해
    //규칙에서 정의한 메서드를 호출하려면
    //먼저 그 클래스의 인스턴스를 생성한 후
    //그 인스턴스를 이용하여 메서드를 호출해야 한다.
    BoardHandler boardHandler = new BoardHandler("게시판1", keyScan);
    BoardHandler boardHandler2 = new BoardHandler("게시판2", keyScan);
    MemberHandler memberHandler = new MemberHandler(keyScan);
    ComputeHandler computeHandler = new ComputeHandler(keyScan);


    menuLoop: while (true) {
      System.out.println("[메뉴]");
      System.out.println("  1: 게시글 관리");
      System.out.println("  2: 게시글 관리2");
      System.out.println("  3: 회원 관리");
      System.out.println("  4: 계산기");
      System.out.print("메뉴를 선택하시오. (종료: quit)[1..3]");
      String menuNo = keyScan.nextLine();

      switch (menuNo) {
        case "1" :
          boardHandler.execute();//앞에 클래스변수 만든 후 메서드execute 호출
          break;
        case "2" :
          boardHandler2.execute();
          break;
        case "3" :
          memberHandler.execute();         
        case "4" :
          computeHandler.execute();
          break;
        case "quit" :
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
      System.out.println();//줄 띄움
    }

    keyScan.close();
    System.out.println("안녕히 가세요!");
  }
}


