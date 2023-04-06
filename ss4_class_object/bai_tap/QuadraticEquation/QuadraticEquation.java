package ss4_class_object.bai_tap.QuadraticEquation;

import java.lang.Math;
import java.util.Scanner;

class QuadraticEquation {
    private double numberA, numberB, numberC;

    public QuadraticEquation(double numberA, double numberB, double numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public double getNumberA() {
        return this.numberA;
    }

    public double getNumberB() {
        return this.numberB;
    }

    public double getNumberC() {
        return this.numberC;
    }

    public double getDiscriminant() {
        return this.numberB * this.numberB - 4 * numberA * numberC;
    }

    public double getRoot1() {
        return (-this.numberB + Math.sqrt(Math.pow(getDiscriminant(), 0.5))) / (this.numberA * 2);
    }

    public double getRoot2() {
        return (-this.numberB - Math.sqrt(Math.pow(getDiscriminant(), 0.5))) / (this.numberA * 2);
    }
}
