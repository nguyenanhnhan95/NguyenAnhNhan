package ss18_regular.bai_tap.name_class;

import java.util.Scanner;

public class TestName {
    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp để kiểm tra :");
        String nameClass = sc.nextLine();
        System.out.println(validateClassName.checkClassName(nameClass));
    }
}
