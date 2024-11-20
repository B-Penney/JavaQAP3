package Problem2;

public class Demo {
    public static void main(String[] args) {
        // Create a Point object
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Point: " + point);

        // Create a MoveablePoint object
        MoveablePoint moveablePoint = new MoveablePoint(3.0f, 4.0f, 0.5f, 0.5f);
        System.out.println("MoveablePoint before moving: " + moveablePoint);

        // Move the MoveablePoint
        moveablePoint.move();
        System.out.println("MoveablePoint after moving: " + moveablePoint);
    }
}
