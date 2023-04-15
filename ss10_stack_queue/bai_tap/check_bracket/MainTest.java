package ss10_stack_queue.bai_tap.check_bracket;

public class MainTest {
    public static void main(String[] args) {
        StackBracket stackBracket = new StackBracket("s * (s – a) * s – b) * (s – c)  ");
        System.out.println(stackBracket.checkBracket());
    }
}
