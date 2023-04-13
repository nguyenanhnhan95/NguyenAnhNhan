package ss9_dsa.bai_tap.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = Arrays.copyOf(elements, capacity);
    }

    public void add(E element) {
        elements[size++] = element;
    }

    public void addIndex(int index, E element) {
        if (index > size) {
            System.out.println("Index exceed array's size ");
        } else {
            for (int i = 0; i < size + 1; i++) {
                if (i == index) {
                    for (int j = size; j > i; j--) {
                        elements[j] = elements[j - 1];
                    }
                }
            }
            elements[index] = element;
            size++;
        }
    }

    public void removeIndex(int index) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                for (int j = i; j < size; j++) {
                    elements[j] = elements[j + 1];
                }
            }
        }
        elements[size] = null;
        size--;
    }

    public void remove(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == element) {
                removeIndex(i);
            }
        }
    }

    public E getIndex(int index) {
        for (int i = 0; i < size; i++) {
            if (i == index) {
                return (E) elements[i];
            }
        }
        return (E) "Index exceed size";
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }
}
