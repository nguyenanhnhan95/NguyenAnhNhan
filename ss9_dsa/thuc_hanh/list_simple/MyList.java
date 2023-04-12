//package ss9_dsa.thuc_hanh.list_simple;
//import java.util.ArrayList;
//public class MyList<arrayE> {
//    public static final int capacity = 17;
//    private arrayE[] data = (arrayE[]) new int[capacity];
//
//    public MyList() {
//    }
//
//    public MyList(arrayE[] objects) {
//        for (int i = 0; i < objects.length; i++) {
//            add(objects[i]);
//        }
//    }
//
//    private void add(int index, arrayE e) {
//        ensureCapacity();
//        for (int i = size - 1; i >= index; i--) data[i + 1] = data[i];
//        data[index] = e;
//        size++;
//    }
//
//    private void ensureCapacity() {
//        if (size >= data.length) {
//            E[] newData = (E[]) (new Object[size * 2 + 1]);
//            System.arraycopy(data, 0, newData, 0, size);
//            data = newData;
//        }
//    }
//
//    public void clear() {
//        data = (E[]) new Object[INITIAL_CAPACITY];
//        size = 0;
//    }
//
//    public boolean contains(arrayE e) {
//        for (int i = 0; i < size; i++)
//            if (e.equals(data[i]))
//                return true;
//        return false;
//    }
//
//    public arrayE get(int index) {
//        checkIndex(index);
//        return data[index];
//    }
//
//    private void checkIndex(int index) {
//        if (index < 0 || index >= size)
//            throw new IndexOutOfBoundsException
//                    ("index " + index + " out of bounds");
//    }
//
//    public int indexOf(E e) {
//        for (int i = 0; i < size; i++)
//            if (e.equals(data[i])) return i;
//        return -1;
//    }
//
//    public int lastIndexOf(E e) {
//
//        for (int i = size - 1; i >= 0; i--) if (e.equals(data[i])) return i;
//        return -1;
//    }
//
//    public E remove(int index) {
//        checkIndex(index);
//
//        E e = data[index];
//
//        // Shift data to the left
//        for (int j = index; j < size - 1; j++)
//            data[j] = data[j + 1];
//
//        data[size - 1] = null; // This element is now null
//
//        // Decrement size
//        size--;
//        return e;
//    }
//    public E set(int index, E e) {
//        checkIndex(index);
//        E old = data[index];
//        data[index] = e;
//        return old;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder result = new StringBuilder("[");
//
//        for (int i = 0; i < size; i++) {
//            result.append(data[i]);
//            if (i < size - 1) result.append(", ");
//        }
//
//        return result.toString() + "]";
//    }
//
//    /**
//     * Trims the capacity to current size
//     */
//    public void trimToSize() {
//
//        if (size != data.length) {
//            E[] newData = (E[]) (new Object[size]);
//            System.arraycopy(data, 0, newData, 0, size);
//            data = newData;
//        } // If size == capacity, no need to trim
//    }
//
//    @Override
//    /** Override iterator() defined in Iterable */
//    public java.util.Iterator iterator() {
//        return new ArrayListIterator();
//    }
//
//    private class ArrayListIterator implements java.util.Iterator {
//        private int current = 0; // Current index
//
//        @Override
//        public boolean hasNext() {
//            return (current < size);
//        }
//
//        @Override
//        public Object next() {
//            return data[current++];
//        }
//
//        @Override
//        public void remove() {
//            MyArrayList.this.remove(current);
//        }
//    }
//}
