package ss9_dsa.thuc_hanh.list_simple;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<arrayE> {
    private int size = 0;
    private static final int capacity = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[capacity];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(arrayE e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public arrayE get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (arrayE) elements[i];
    }
}
