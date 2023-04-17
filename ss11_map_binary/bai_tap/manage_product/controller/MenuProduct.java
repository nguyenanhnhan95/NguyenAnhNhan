package ss11_map_binary.bai_tap.manage_product.controller;

import ss11_map_binary.bai_tap.manage_product.service.ProductService;

import java.util.Scanner;

public class MenuProduct {
    private Scanner sc = new Scanner(System.in);
    private String choice;
    private boolean flag = true;
    private ProductService productService = new ProductService();
    public void display() {
        do {
            System.out.println("1. Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phâm \n" +
                    "3.Xóa sản phẩm.\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiêm sản phẩm thêm tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá.\n" +
                    "7. Thoát \n" +
                    "Vui lòng bạn nhập cú pháp lựa chọn ");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    productService.addProduct();
                    break;
                case "2":
                    productService.setInformation();
                    break;
                case "3":
                    productService.deleteProduct();
                    break;
                case "4":
                    productService.getList();
                    break;
                case "5":
                    productService.findProduct();
                    break;
                case "6":
                    productService.sortIncrease();
                    break;
                case "7":
                    flag = false;
                    break;
                default:
                    System.out.println("Vui long bạn nhập lại \n:");
            }
        } while (flag);
    }
}
