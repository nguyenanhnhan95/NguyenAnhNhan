package ss13_sort_algorithm.bai_tap.manage_fruit.controller;

import ss13_sort_algorithm.bai_tap.manage_fruit.service.FruitService;

import java.util.Scanner;

public class MenuFruit {
    private Scanner sc = new Scanner(System.in);
    private String choice;
    private FruitService fruitService = new FruitService();

    public void display() {
        do {
            System.out.println("Quản lý sản phẩm \n" +
                    "1.Hiển thị danh sách\n" +
                    "2.Thêm sản phẩm trái cấy\n" +
                    "3.Xóa sản phẩm trái cây\n" +
                    "4.Sắp xếp sản phẩm theo giá tăng dần\n" +
                    "5.Sắp xếp sản phẩm theo chất lượng giảm dần\n" +
                    "6.Thay đổi số liệu sản phẩm\n" +
                    "7.Thoát\n" +
                    "Mời bạn nhập bàn 1->6\n");
            choice = sc.nextLine();
            switch (choice) {
                case "1":
                    fruitService.display();
                    break;
                case "2":
                    fruitService.add();
                    break;
                case "3":
                    System.out.println(fruitService.delete());
                    break;
                case "4":
                    fruitService.sortIncrease();
                    break;
                case "5":
                    fruitService.sortDecrease();
                    break;
                case "6":
                    System.out.println(fruitService.editFruit());
                    ;
                    break;
                case "7":
                    System.exit(0);
            }
        } while (true);
    }
}
