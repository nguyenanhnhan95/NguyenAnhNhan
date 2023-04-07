package ss5_access_modifiers.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle(double r) {
        this.radius = r;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}

