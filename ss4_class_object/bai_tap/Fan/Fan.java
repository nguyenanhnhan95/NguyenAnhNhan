package ss4_class_object.bai_tap.Fan;

public class Fan {
    public static final Byte SLOW = 1;
    public static final Byte MEDIUM = 2;
    public static final Byte FAST = 3;
    public byte speed = 1;
    public boolean on = false;
    public String color = "blue";
    public double radius = 5.0;

    public Fan(byte speed,boolean on, String color, double radius) {
        this.speed=speed;
        this.on = on;
        this.color = color;
        this.radius = radius;
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public byte getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public String toString() {
        if (on) {
            return "Speed=" + this.getSpeed() + "color=" + this.getColor() + "radius" + this.getRadius() + "fan is off";
        } else {
            return "color=" + this.color + "radius=" + this.radius + "fan is off";
        }
    }
}

