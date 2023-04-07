package ss6_inheritance.bai_tap.design_triangle;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Yellow");
        System.out.println(shape);
        Triangle triangle = new Triangle("blue", 3, 4, 5);
        System.out.println(triangle);
    }
}
