package ss10_stack_queue.bai_tap.check_bracket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackBracket {
    private List<String> bStack = new ArrayList<>();
    private String math;

    public StackBracket() {
    }

    public StackBracket(String math) {
        this.math = math;
    }

    public List<String> getbStack() {
        return bStack;
    }

    public void setbStack(List<String> bStack) {
        this.bStack = bStack;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public boolean isEmpty() {
        if (getbStack().size() == 0) {
            return true;
        }
        return false;
    }

    public boolean checkBracket() {
        setbStack(Arrays.asList(getMath().split("")));
        int size = getbStack().size();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (getbStack().get(i).equals("(")) {
                if (isEmpty()) {
                    return false;
                }
                count++;
            } else if (getbStack().get(i).equals(")")) {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}
