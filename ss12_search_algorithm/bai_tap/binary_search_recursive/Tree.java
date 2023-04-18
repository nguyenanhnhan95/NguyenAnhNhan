package ss12_search_algorithm.bai_tap.binary_search_recursive;

public class Tree<E extends Comparable<E>> {
    private int size = 0;
    private NodeTree<E> root;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NodeTree<E> getRoot() {
        return root;
    }

    public void setRoot(NodeTree<E> root) {
        this.root = root;
    }

    private static class NodeTree<E> {
        private E element;
        private NodeTree<E> left;
        private NodeTree<E> right;

        public NodeTree(E e) {
            this.element = e;
            this.left = null;
            this.right = null;
        }
    }

    public Tree() {
    }

    public Tree(int size) {
        this.size = size;
    }


    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insertNode(E e) {
        if (isEmpty()) {
            root = new NodeTree<>(e);
            size++;
        } else {
            NodeTree<E> parent = null;
            NodeTree<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) > 0) {
                parent.right = new NodeTree<>(e);
            } else if (e.compareTo(parent.element) < 0) {
                parent.left = new NodeTree<>(e);
            }
        }
        size++;
        return false;
    }

    public boolean findElement(E e) {
        if (isEmpty()) {
            return false;
        }
        NodeTree<E> nodeFind = root;
        while (nodeFind != null) {
            if (e.compareTo(nodeFind.element) > 0) {
                nodeFind = nodeFind.right;
                System.out.println(nodeFind.element);
            } else if (e.compareTo(nodeFind.element) < 0) {
                nodeFind = nodeFind.left;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean deleteElement(NodeTree<E> root, E e) {
        if (root == null) {
            return false;
        }
        if (e.compareTo(root.element) > 0) {
            return deleteElement(root.right, e);
        } else if (e.compareTo(root.element) < 0) {
            return deleteElement(root.left, e);
        } else if (root.left == root.right) {
            root = null;
            return true;
        } else if (root.right != null) {
            root = root.right;
            return true;
        } else if (root.left != null) {
            root = root.left;
            return true;
        }
        return false;
    }
}


