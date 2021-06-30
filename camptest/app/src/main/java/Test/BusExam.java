package Test;

public class BusExam {

  public static void main(String[] args) {

    Bus bus = new Bus();
    bus.run(); 

    bus.ppangppang();

    Car car = new Car();
    car.run();
    //    car.ppangppang(); 부모는 자식클래스의 메서드 사용x
  }
}
