package com.yong.day0701;


import java.util.Scanner;

public class TestHotel {

  private int floor;  //층 //3층까지
  private int room;   //호 //5호까지
  private String name[][] = new String[3][5]; //몇층몇호
  private String title;

  public TestHotel( ) { }
  public TestHotel(String m) { this.title=m; }

  public void process(){//non-static메소드 
    map(); 
    System.out.println();

    Scanner sc = new Scanner(System.in);
    int sel = 0;
    while(true){
      System.out.print("\n1.투숙  2.퇴실  3.map  4.list   9.종료? ");
      sel = Integer.parseInt( sc.nextLine()); 

      switch(sel){
        case 1: //투숙
          checkIn();
          break;
        case 2: //퇴실
          checkOut();
          break;
        case 3: //전체보기
          map();  //map호출
          break;
        case 4: //전체보기
          list();
          break;
        case 9:
          System.out.println("\n"+title+" 호텔프로그램을 종료하겠습니다.");
          return;
      }
    }//while end
  }//end


  public void checkIn(){ //non-static메소드 
    Scanner sc = new Scanner(System.in);

    System.out.print(" >몇층에 투숙? ");
    floor =  Integer.parseInt( sc.nextLine());
    System.out.print(" >몇호에 투숙? ");
    room =  Integer.parseInt( sc.nextLine()); 
    if( name[floor-1][room-1] != null ){
      System.out.println("# 이미 투숙중인 방입니다.");
      return ;
    }
    System.out.print(" >투숙객 이름? ");
    name[floor-1][room-1] =sc.nextLine(); 
    System.out.println("# 성공적으로 checkIn 되었습니다.");
  }//end

  public void checkOut(){ //non-static메소드 
    Scanner sc = new Scanner(System.in);
    System.out.print("> 몇층에서 퇴실? ");
    floor =  Integer.parseInt( sc.nextLine()); 
    System.out.print("> 몇호에서 퇴실? ");
    room =  Integer.parseInt( sc.nextLine());
    if( name[floor-1][room-1] == null ){
      System.out.println("# 이미 빈 방입니다.");
      return ;
    }
    name[floor-1][room-1] = null;
    System.out.println("# 성공적으로 checkOut 되었습니다.");
  }//checkOut end

  public void map(){ //non-static메소드 
    System.out.println("\n\t[ "+ title +" 투숙 상태 ]");
    for(int i = 0; i < 3; i++){
      for(int b = 0; b < 5; b++){
        System.out.print((i+1)+"0"+(b+1)+"\t");
      }

      System.out.println(); //이름표시 공백란입니다

      for(int j = 0; j < 5; j++){
        if(this.name[i][j] == null){
          System.out.print("\t");
          continue;
        }//if end
        System.out.print(this.name[i][j]+"\t"); //권장 \t있으면 훨씬 좋아요  hong Tab키 LEE 
        //System.out.print(this.name[i][j]);  위의 코드보다 \t없으면  hongLEE 
      }//j end
      System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ"); // \n꼭넣으세요 
    }//for i end
  } //map end


  public void list(){ //non-static메소드 
    System.out.println("\n\t[ "+ title +" 투숙 상태 ]");
    //중첩for if문
    for(int i=0; i<name.length; i++){
      for(int j=0; j<name[i].length; j++){
        if(name[i][j] == null){
          System.out.print(""+ (i+1) +"0" + (j+1) + "호" + " □\t" + "\t");
        }else{
          System.out.print(""+ (i+1) +"0" + (j+1) + "호" + " ■\t" + name[i][j] + "\t");
        }
      }
      System.out.println();
    }//if end
  } //showStatus end


  public static void main(String[] args) {
    TestHotel mm= new TestHotel("델루나");
    mm.process();
  } //main end
}//TestHotel class END


