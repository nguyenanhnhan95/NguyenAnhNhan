package ss6_inheritance.bai_tap.moveable_point;

import java.util.Arrays;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] arrayB = new float[2];
        arrayB[0] = getXSpeed();
        arrayB[1] = getYSpeed();
        return arrayB;
    }

    @Override
    public String toString() {
        return super.toString() + "speed=" + getXSpeed() + "," + getYSpeed();
    }

    public void move() {
        float stepX = getX() + getXSpeed();
        float stepY = getY() + getYSpeed();
        setXY(stepX, stepY);
    }
}
