package ss7_abstract_interface.thuc_hanh.comparator;

import ss7_abstract_interface.thuc_hanh.comparable.Circle;
import ss7_abstract_interface.thuc_hanh.comparable.ComparableCircle;

import java.util.Comparator;
import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5, true, "Blue");

        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getColor());
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle.getColor());
        }
    }
}
