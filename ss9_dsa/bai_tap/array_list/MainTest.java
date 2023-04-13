package ss9_dsa.bai_tap.array_list;

public class MainTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(5);
        myList.add(54);
        myList.add(6);
        myList.add(9);
        myList.add(15);

        myList.addIndex(2, 16);
        myList.display();
        System.out.println("-------");
        myList.remove(54);
        myList.display();
        System.out.println("-------");
        System.out.println(myList.getIndex(3));

    }
}
