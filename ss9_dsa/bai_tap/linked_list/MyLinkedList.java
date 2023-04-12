package ss9_dsa.bai_tap.linked_list;

public class MyLinkedList<E> {
    private Node heap;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
    }

    public void add(int index, E element) {
        if (index > numNodes) {
            System.out.println("index exceed size");
        } else {
            Node temp = heap;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            Node tempB = temp.next;
            temp.next = new Node(element);
            temp.next.next = tempB;
            numNodes++;
        }
    }

    public void delete(int index) {
        boolean flag = true;
        if (heap.next == null) {
            System.out.println("Empty");
        } else {
            Node temp = heap;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
                if (i == (index - 2)) {
                    Node tempB = temp;
                    tempB.next = temp.next.next;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("index exceed size");
            }
        }
        numNodes--;
    }

    public void addFist(E element) {
        if (numNodes == 0) {
            heap.next = new Node(element);
        } else {
            Node temp = new Node(element);
            temp.next = heap;
            heap.next = temp;
            numNodes++;
        }
    }

    public void display() {
        while (heap.next == null) {
            System.out.println(heap.data);
        }
    }
}
