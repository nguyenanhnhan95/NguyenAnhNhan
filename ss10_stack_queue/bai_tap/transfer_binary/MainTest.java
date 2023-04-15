package ss10_stack_queue.bai_tap.transfer_binary;

public class MainTest {
    public static void main(String[] args) {
        OperatorBit transferBit = new OperatorBit();
        transferBit.transferBinary(35);
        System.out.println(transferBit.getStackBit());
    }
}
