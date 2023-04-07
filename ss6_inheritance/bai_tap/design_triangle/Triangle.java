package ss6_inheritance.bai_tap.design_triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        return getSide1() + getSide2() + getSide3();
    }

    public double getArea() {
        double numberP = getPerimeter() / 2.0;
        return Math.pow((numberP) * (numberP - getSide1()) * (numberP - getSide2()) * (numberP - getSide3()), 0.5);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color=" + getColor() + "\n" +
                "side1=" + getSide1() + "\n" +
                "side2=" + getSide2() + "\n" +
                "side3=" + getSide3() + "\n" +
                "Perimeter=" + getPerimeter() + "\n" +
                "Are =" + getArea();
    }
}
