package ss13_sort_algorithm.bai_tap.manage_fruit.service;

import ss13_sort_algorithm.bai_tap.manage_fruit.model.Fruit;
import ss13_sort_algorithm.bai_tap.manage_fruit.repository.FruitRepository;

import java.time.LocalDate;
import java.util.*;

public class FruitService implements IFruitService<Fruit> {
    private Scanner sc = new Scanner(System.in);
    private FruitRepository fruitRepository = new FruitRepository();

    public FruitService() {
    }

    @Override
    public List<Fruit> getList() {
        return fruitRepository.getList();
    }

    @Override
    public void add() {
        String dayManufacture, dayExpire, name, originManufacture;
        LocalDate dateOne, dateTwo;
        int qualifyFruit, price;
        boolean flag = true;
        do {
            System.out.println("Tên sản phẩm :");
            name = sc.nextLine();
            System.out.println("Sản phẩm loại :");
            qualifyFruit = Integer.parseInt(sc.nextLine());
            System.out.println("Ngày sản xuất vd :năm-tháng-ngày:");
            dayManufacture = sc.nextLine();
            dateOne = LocalDate.parse(dayManufacture);
            System.out.println("Ngày hết hạn :");
            dayExpire = sc.nextLine();
            dateTwo = LocalDate.parse(dayExpire);
            System.out.println("Nơi sản xuất :");
            originManufacture = sc.nextLine();
            System.out.println("Nhập giá tiền :");
            price = Integer.parseInt(sc.nextLine());
            if (dateOne.isBefore(dateTwo)) {
                flag = false;
            } else {
                System.out.println("Bạn nhập ko đúng mẫu");
            }
        } while (flag);
        fruitRepository.addFruit(new Fruit(name, qualifyFruit, dateTwo, dateOne, originManufacture, price));
    }

    //        public Fruit(String name, int quality, LocalDate expireFruit, java.time.LocalDate dateOfManufacture, String origin) {
    @Override
    public void display() {
        System.out.println("+----------------------------------------------------------------------------------+");
        System.out.println("| Tên          |Loại  | Ngày sản xuất  | Ngày hết hạn   |Nơi sản xuất  |  Giá      |");
        System.out.println("+----------------------------------------------------------------------------------+");
        for (Fruit a : fruitRepository.getList()) {
            System.out.printf("| %-12s | %-5s| %-15s| %-15s| %-13s|%8s|\n", a.getName(), a.getQuality(), a.getDateOfManufacture(), a.getExpireFruit(), a.getOrigin(), a.getPrice());
            System.out.println("+----------------------------------------------------------------------------------+");
        }
    }

    @Override
    public String delete() {
        System.out.println("Nhập tên sản phẩm bạn muốn xóa");
        String name = sc.nextLine();
        int size = fruitRepository.getList().size();
        for (int i = 0; i < size; i++) {
            if (fruitRepository.getList().get(i).getName().equals(name)) {
                fruitRepository.deleteFruit(i);
                return "Xóa thành công";
            }
        }
        return "Không tồn tại ";
    }

    @Override
    public void sortIncrease() {
        fruitRepository.getList().sort(((o1, o2) -> o1.getPrice() - o2.getPrice()));
        display();
    }

    @Override
    public void sortDecrease() {
        fruitRepository.getList().sort(((o1, o2) -> o2.getQuality() - o1.getQuality()));
        display();
    }

    @Override
    public String editFruit() {
        System.out.println("Nhập tên sản phẩm cần chỉnh sửa");
        int price, qualify;
        String nameFruit = sc.nextLine();
        int size = fruitRepository.getList().size();
        for (int i = 0; i < size; i++) {
            if (fruitRepository.getList().get(i).getName().equals(nameFruit)) {
                if (fruitRepository.editFruit(fruitRepository.getList().get(i).getName())) {
                    System.out.println("Nhập giá tiền mới=");
                    price = Integer.parseInt(sc.nextLine());
                    fruitRepository.getList().get(i).setPrice(price);
                    System.out.println("Nhập chất lượng loại :");
                    qualify = Integer.parseInt(sc.nextLine());
                    fruitRepository.getList().get(i).setQuality(qualify);
                    return "Đã sửa đổi thành công";
                }
            }
        }
        return "Đã sửa đổi không thành công";
    }
}
