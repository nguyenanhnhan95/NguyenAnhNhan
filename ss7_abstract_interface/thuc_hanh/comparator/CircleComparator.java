package ss7_abstract_interface.thuc_hanh.comparator;

import ss7_abstract_interface.thuc_hanh.comparable.Circle;
import ss7_abstract_interface.thuc_hanh.comparable.ComparableCircle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}

