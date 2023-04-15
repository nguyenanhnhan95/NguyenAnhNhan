package ss10_stack_queue.bai_tap.transfer_binary;

import java.util.ArrayList;
import java.util.List;

public class OperatorBit {
    private int size = 0;
    private List<Integer> stackBit = new ArrayList<Integer>(size);

    public OperatorBit() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Integer> getStackBit() {
        return stackBit;
    }

    public void setStackBit(List<Integer> stackBit) {
        this.stackBit = stackBit;
    }

    public void pushStack(Integer element) {
        stackBit.add(element);
    }

    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            Integer temp = (Integer) stackBit.get(i);
            stackBit.set(i, stackBit.get(getSize() - 1 - i));
            stackBit.set(getSize() - 1 - i, temp);
        }
    }

    public void transferBinary(Integer decimal) {
        int decimalNormal = (int) decimal;
        while (decimalNormal > 0) {
            if (decimalNormal % 2 == 0) {
                decimalNormal = decimalNormal / 2;
                pushStack(0);
            } else {
                decimalNormal = decimalNormal / 2;
                pushStack(1);
            }
            ++size;
        }
        reverse();
    }
}
