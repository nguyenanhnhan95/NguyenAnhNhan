package ss10_stack_queue.bai_tap.reverse_stack;

public class MainTest {
    public static void main(String[] args) {
        ReverseStack<Integer> stackInteger = new ReverseStack<Integer>();
        stackInteger.pushStack(5);
        stackInteger.pushStack(6);
        stackInteger.pushStack(15);
        stackInteger.pushStack(3);
        stackInteger.popStack();
        System.out.println(stackInteger.getSize());
        System.out.println(stackInteger.getStack());
        stackInteger.reverse();
        System.out.println(stackInteger.getStack());
        ReverseStack<String> stackString = new ReverseStack<String>();
        stackString.pushStack("nhan");
        stackString.pushStack("vu");
        stackString.pushStack("thới");
        stackString.pushStack("HUY");
        stackString.popStack();
        System.out.println(stackString.getSize());
        System.out.println(stackString.getStack());
        stackString.reverse();
        System.out.println(stackString.getStack());
    }
}
