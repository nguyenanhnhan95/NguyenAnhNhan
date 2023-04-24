package ss16_io_file_binary.bai_tap.manage_product.controller;

import ss16_io_file_binary.bai_tap.manage_product.service.ProductService;

import java.util.Scanner;

public class MenuProduct {
    private Scanner sc = new Scanner(System.in);
    private ProductService productService = new ProductService();
    public String choice;

    public void display() {
        do {
            System.out.println("Mời bạn lựa chọn \n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị sản phẩm \n" +
                    "3. Tìm sản phẩm \n" +
                    "4. Thoát");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.display();
                    break;
                case "3":
                    productService.findProduct();
                    break;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập sai cú pháp ");
            }
        } while (true);
    }
}
