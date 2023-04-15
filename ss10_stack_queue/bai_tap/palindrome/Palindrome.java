package ss10_stack_queue.bai_tap.palindrome;

public class Palindrome {
    private String arrPalindrome;

    public Palindrome() {
    }

    public Palindrome(String arrPalindrome) {
        this.arrPalindrome = arrPalindrome;
    }

    public String getArrPalindrome() {
        return arrPalindrome;
    }

    public void setArrPalindrome(String arrPalindrome) {
        this.arrPalindrome = arrPalindrome;
    }

    public String checkPalindrome() {
        int size = arrPalindrome.toCharArray().length;
        char[] arrayA = new char[size];
        arrayA = arrPalindrome.toCharArray();
        for (int i = 0; i < size / 2; i++) {
            if (arrayA[i] != arrayA[size - 1 - i]) {
                return "is not palindrome";
            }
        }
        return "is palindrome";
    }
}
