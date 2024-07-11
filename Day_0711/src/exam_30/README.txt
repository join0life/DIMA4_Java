[문제]
abstract로 선언된 Point 클래스를 상속받는 Circle과 Rectangle클래스
를 구현하고, 이를 단위테스트 하는 클래스를 작성하시오. 이때 단위테
스트 코드 내에는 Circle과 Rectangle를 참조하는 Point 타입의 객체 배
열로 구현하시오.

public abstract class Point {
   x, y
   abstract area();
   print();  // x, y 좌표 출력
}

public class Circle extends Point {
   radius
   area() 오버라이딩  // 원의 면적
   print() 오버라이딩 // radius 출력
}

public class Rectangle extends Point {
   width, height
   area() 오버라이딩  // 면적 구함
   print() 오버라이딩 // w, h 출력
}


Main {
    Point[] polygon = new Point[10];
    polygon[0] = new Circle();
    polygon[1] = new Rectangle();
}