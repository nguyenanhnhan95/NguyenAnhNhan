package ss9_dsa.bai_tap.linked_list;

public class MainTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
        myLinkedList.addFist(5);
        myLinkedList.addFist(7);
        myLinkedList.printList();
        myLinkedList.delete(1);
        myLinkedList.printList();
    }
}
