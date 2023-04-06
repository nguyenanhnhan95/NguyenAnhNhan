package ss4_class_object.bai_tap.quadratic_equation;

import java.util.Scanner;

public class MainQuadractic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A :");
        double numberA = Double.parseDouble(sc.nextLine());
        System.out.println("Enter number B :");
        double numberB = Double.parseDouble(sc.nextLine());
        System.out.println("Enter number C :");
        double numberC = Double.parseDouble(sc.nextLine());
        QuadraticEquation caculateOne = new QuadraticEquation(numberA, numberB, numberC);
        if (caculateOne.getDiscriminant() > 0) {
            System.out.printf("solution one =" + caculateOne.getRoot1() + "solution two" + caculateOne.getRoot2());
        } else if (caculateOne.getDiscriminant() == 0) {
            System.out.printf("Solution one =" + caculateOne.getRoot1());
        } else {
            System.out.printf("The equation has no roots");
        }
    }
}
