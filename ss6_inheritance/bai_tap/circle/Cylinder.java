package ss6_inheritance.bai_tap.circle;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateVolume() {
        return calculateArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder" +
                "height=" + height + super.toString() + "Volume=" + calculateVolume() +
                "m3";
    }
}
