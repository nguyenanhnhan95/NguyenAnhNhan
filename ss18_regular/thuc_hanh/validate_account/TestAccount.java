package ss18_regular.thuc_hanh.validate_account;

import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
        ValidateAccount validateAccount = new ValidateAccount();
        System.out.println("Nhập tên tài khoản :");
        Scanner sc = new Scanner(System.in);
        String nameAccount = sc.nextLine();
        System.out.println(validateAccount.confirmAccount(nameAccount));
    }
}
