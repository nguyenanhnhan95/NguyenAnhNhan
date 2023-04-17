package ss12_search_algorithm.bai_tap.binary_search_recursive;

public class BinaryTree<E extends Comparable<E>>extends Tree<E>{
    protected TreeNode<E> root;
    protected   int size=0;
    public BinaryTree(){}

    @Override
    public boolean insert(E e) {
        if(root==null){
            root=new TreeNode<>(e);
        }
        else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if(e.compareTo(current.element)<0){
                    parent=current;
                    current=current.left;
                }
                else if(e.compareTo(current.element)>0){
                    parent = current;
                    current = current.right;
                }
                else {
                    return false;
                }
            }
        }
    }

    @Override
    public void inorder(E e) {

    }

    @Override
    public int getSize() {
        return size;
    }
}
