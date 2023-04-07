package ss6_inheritance.bai_tap.moveable_point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5, 5);
        System.out.println(point);
        MovablePoint movePoint = new MovablePoint(4, 5, 3, 4);
        System.out.println(movePoint);
        movePoint.move();
        System.out.println(movePoint);
    }
}
