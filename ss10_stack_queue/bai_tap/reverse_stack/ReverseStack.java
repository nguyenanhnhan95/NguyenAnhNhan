package ss10_stack_queue.bai_tap.reverse_stack;

import java.util.ArrayList;
import java.util.List;

public class ReverseStack<E> {
    private List<E> arrayStack = new ArrayList<E>();
    private int size;

    public ReverseStack() {
    }

    public ReverseStack(int size) {
        this.size = size;
    }

    public List<E> getStack() {
        return arrayStack;
    }

    public void setStack(List<E> stack) {
        arrayStack = stack;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        if (getSize() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void pushStack(E element) {
        arrayStack.add(element);
        setSize(getSize() + 1);
    }

    public void popStack() {
        if (isEmpty()) {
            arrayStack.remove(getSize() - 1);
            setSize(getSize() - 1);
        } else {
            System.out.println("Empty");
        }
    }

    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            E temp = (E) arrayStack.get(i);
            arrayStack.set(i, arrayStack.get(getSize() - 1 - i));
            arrayStack.set(getSize() - 1 - i, temp);
        }
    }
}
