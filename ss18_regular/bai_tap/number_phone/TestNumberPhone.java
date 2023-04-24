package ss18_regular.bai_tap.number_phone;

import java.util.Scanner;

public class TestNumberPhone {
    public static void main(String[] args) {
        ValidateNumberPhone validateNumberPhone=new ValidateNumberPhone();
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số điện thoại để kiểm tra :");
        String numberPhone= sc.nextLine();
        validateNumberPhone.checkNumberPhone(numberPhone);
    }
}
