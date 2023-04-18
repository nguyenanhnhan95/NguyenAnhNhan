package ss12_search_algorithm.bai_tap.creat_tree;

import java.lang.management.GarbageCollectorMXBean;

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

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public NodeTree<E> getLeft() {
            return left;
        }

        public void setLeft(NodeTree<E> left) {
            this.left = left;
        }

        public NodeTree<E> getRight() {
            return right;
        }

        public void setRight(NodeTree<E> right) {
            this.right = right;
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
            } else if (e.compareTo(nodeFind.element) < 0) {
                nodeFind = nodeFind.left;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean deleteElement(E e) {
        if (root == null) {
            return false;
        }
        while (root != null) {
            if (e.compareTo(root.element) > 0) {
                root = root.right;
            } else if (e.compareTo(root.element) < 0) {
                root = root.left;
            } else {
                if (root.left == root.right) {
                    root = null;
                } else if (root.right != null) {
                    root = root.right;
                } else {
                    root = root.left;
                }
                return true;
            }
        }
        return false;
    }
}


