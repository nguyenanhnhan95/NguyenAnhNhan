package ss7_abstract_interface.thuc_hanh.comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6, "blue", true);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(5);
        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle.getColor());
        }
        ComparableCircle circle1 = new ComparableCircle();
        System.out.println(circles[0].compareTo(circle1));
    }
}
