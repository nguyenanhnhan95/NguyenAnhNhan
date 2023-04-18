package ss12_search_algorithm.bai_tap.binary_search_recursive;

public class MainTest {
    public static void main(String[] args) {
        Tree<Integer> tree=new Tree<>();
        tree.insertNode(5);
        tree.insertNode(7);
        tree.insertNode(6);
        tree.insertNode(9);
        System.out.println(tree.findElement(9));
        System.out.println(tree.deleteElement(tree.getRoot(),9));
        System.out.println(tree.findElement(9));
    }
}
