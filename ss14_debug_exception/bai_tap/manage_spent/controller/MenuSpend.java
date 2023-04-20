package ss14_debug_exception.bai_tap.manage_spent.controller;

import ss14_debug_exception.bai_tap.manage_spent.service.SpenseService;

import java.util.Scanner;

public class MenuSpend {
    private Scanner sc = new Scanner(System.in);
    private String choice;
    private SpenseService spenseService = new SpenseService();
    public MenuSpend(){}
    public void display() {
        do {
            System.out.println("1. Hiển thị danh sách:\n" +
                    "2.Thêm danh sách chi tiêu \n" +
                    "3.Xóa \n" +
                    "4.Sửa\n" +
                    "5. Tìm kiếm theo mã chi tiêu\n" +
                    "6.Tìm kiếm gần đúng theo tên chi tiêu\n" +
                    "7. Thoát\n" +
                    "Mời lựa chọn cú pháp thực hiện\n");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    spenseService.display();
                    break;
                case "2":
                    spenseService.addSpense();
                    break;
                case "3":
                    System.out.println("xóa");
                    break;
                case "4":
                    System.out.println("sửa");
                    break;
                case "5":
                    System.out.println("tim");
                    break;
                case "6":
                    System.out.println("Tìm gần đúng");
                    break;
                case "7":
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập sai ");
            }
        } while (true);
    }
}
