package ss6_inheritance.bai_tap.circle;

public class MainCircleCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "red");
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder(5, "yellow", 7);
        System.out.println(cylinder.toString());
    }
}
