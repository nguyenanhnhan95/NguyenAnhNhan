package ss12_search_algorithm.bai_tap.binary_search_recursive;

public interface ITreeNode <E>{
    boolean insert(E e);
    void inorder(E e);
    public int getSize();
}
