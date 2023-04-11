package ss7_abstract_interface.bai_tap.resizeable;

public class Rectangle extends Shape implements IResizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, boolean filled, String color) {
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

    @Override
    public void resize(double percent) {
        this.width = getWidth() + (percent * getWidth()) / 100;
        this.length = getLength() + (percent * getLength()) / 100;
    }

    @Override
    public String toString() {
        return "A Rectangle with width=" + getWidth() + "and" +
                " length=" + getLength() + super.toString();
    }
}