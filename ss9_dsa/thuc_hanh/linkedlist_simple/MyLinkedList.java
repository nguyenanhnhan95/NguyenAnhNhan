package ss9_dsa.thuc_hanh.linkedlist_simple;

public class MyLinkedList {
    private Node heap;
    private int numberNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList(int i) {
    }

    public void add(int index, int data) {
        Node temp = heap;
        Node temp2;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        Node holder = new Node(data);
        temp2 = temp.next;
        temp.next = holder;
        holder.next = temp2;
    }

    public void addFirst(int data) {
        Node temp = heap;
        heap = new Node(data);
        heap.next = temp;
        numberNodes++;
    }

    public Node get(int index) {
        Node temp = heap;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = heap;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}