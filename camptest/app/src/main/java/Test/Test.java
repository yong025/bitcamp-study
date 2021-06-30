package Test;

public class Test {
  // for each 실습 문제
  //  public static void main(String[] args) {
  //    int [] array = {1, 5, 3, 6, 7};
  //    //for each문을 이용해서 array의 값을 한 줄씩 출력하세요
  //    for (int value : array) {
  //      System.out.println(value);
  //    }
  //    for(int i=0; i < array.length; i++) {
  //      int aa = array[i];
  //      System.out.println(aa);
  //    }
  //  }
  //}
  //2차원 배열 실습문제
  public static void main(String[] args) {
    int [][] array = {{1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}};

    // 2차원 배열 array를 출력합니다.
    for(int i = 0 ; i < array.length; i++) {
      System.out.print( (i+1) + "번째 줄을 출력합니다>");
      for(int j = 0; j< array[i].length; j++) {//i는 열(세로) j는 행(가로)
        System.out.print(array[i][j]+" ");
      }
      System.out.println("");
    }
  }
}