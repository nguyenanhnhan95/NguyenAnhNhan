package ss7_abstract_interface.bai_tap.colorable;

import ss7_abstract_interface.bai_tap.colorable.IColorable;


public class Square extends Shape implements IColorable {
    private double width = 0.0d;
    private double length = 0.0d;

    public Square(double width, double length, boolean filled, String color) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double calculateArea() {
        return getWidth() * getLength();
    }

    public double calculatePerimeter() {
        return 2 * (getWidth() + getLength());
    }

    @Override
    public String toString() {
        return super.toString() + "Square{" +
                "width=" + getWidth() +
                ", length=" + getLength() +
                "Area ="+calculateArea()+"Perimeter="+calculatePerimeter();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}