package ss9_dsa.bai_tap.linked_list;

public class MyLinkedList<E> {
    private Node heap;
    private int numNodes = 0;

    private class Node {
        private Node next = null;
        private Object data;

        public Node(Object data) {
            this.data = data;
            this.next = null;
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

    public void addIndex(int index, E element) {
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
        if (heap == null) {
            System.out.println("Empty");
        } else if (index == 0) {
            heap = heap.next;
        } else {
            Node temp = heap;
            for (int i = 1; i <= index && temp.next != null; i++) {
                if (i == index) {
                    Node tempTwo = temp;
                    temp = temp.next.next;
                    tempTwo.next = temp;
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
        if (heap == null) {
            heap = new Node(element);

        } else {
            Node tempTwo = new Node(element);
            tempTwo.next = heap;
            heap = tempTwo;
        }
        numNodes++;
    }

    public void printList() {
        Node temp = heap;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
//    public void addFist(E element) {
//        if (numNodes == 0) {
//            heap.next = new Node(element);
//        } else {
//            Node temp = new Node(element);
//            temp.next = heap;
//            heap.next = temp;
//            numNodes++;
//        }
//    }