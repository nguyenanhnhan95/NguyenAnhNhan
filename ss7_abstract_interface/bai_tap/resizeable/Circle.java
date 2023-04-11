package ss7_abstract_interface.bai_tap.resizeable;


public class Circle extends Shape implements IResizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        this.radius = getRadius() + (percent * getRadius()) / 100;
    }

    @Override
    public String toString() {
        return "A circle with radius ="
                + radius + ",which is a subclass of" + super.toString();
    }
}
