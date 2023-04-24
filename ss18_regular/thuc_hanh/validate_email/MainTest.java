package ss18_regular.thuc_hanh.validate_email;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidateEmail validateEmail =new ValidateEmail();
        System.out.println("Nhập email :");
        String email = sc.nextLine();
        System.out.println(validateEmail.validate(email));
    }
}
