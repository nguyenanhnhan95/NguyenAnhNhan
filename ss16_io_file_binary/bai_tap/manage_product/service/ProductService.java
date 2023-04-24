package ss16_io_file_binary.bai_tap.manage_product.service;

import ss16_io_file_binary.bai_tap.manage_product.common.Common;
import ss16_io_file_binary.bai_tap.manage_product.model.Product;
import ss16_io_file_binary.bai_tap.manage_product.repository.ProductRepository;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService<Product> {
    private Scanner sc = new Scanner(System.in);
    private ProductRepository productRepository = new ProductRepository();
    private List<Product> arrayProduct = productRepository.readProduct();

    @Override
    public void display() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("| Id    | Tên sản phẩm | Gía tiền  | Nơi sản xuất |");
        for (Product a : arrayProduct) {
            System.out.println("+-------+--------------+-----------+--------------+");
            System.out.printf("|%-7s|%-14s|%11s|%-14s|\n", a.getId(), a.getNameProduct(), a.getPrice(), a.getOrigin());
        }
        System.out.println("+-------------------------------------------------+");
    }

    @Override
    public void addProduct() {
        int count = 0;
        String id = null, price = null, origin = null;
        String nameProduct = null;
        do {
            switch (count) {
                case 0:
                    System.out.println("Nhập mã sản phẩm");
                    id = sc.nextLine().trim();
                    boolean flag = true;

                    for (Product product : arrayProduct) {
                        if (product.getId().equals(id)) {
                            System.out.println("Sản phẩm đã tồn tại\nVui lòng nhập lại :");
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        if (id.matches("[a-zA-Z 0-9]+")) {
                            ++count;
                        }
                    }
                    break;
                case 1:
                    System.out.println("Nhập tên sản phẩm :");
                    nameProduct = sc.nextLine().trim();
                    if (nameProduct.matches("[a-zA-Z ]+")) {
                        ++count;
                    } else {
                        System.out.println("Nhập tên không hợp lệ :");
                    }
                    break;
                case 2:
                    System.out.println("Nhập giá sản phẩm :");
                    price = sc.nextLine().trim();
                    if (price.matches("[0-9]+")) {
                        ++count;
                    } else {
                        System.out.println("Bạn nhập khôn hợp lệ :");
                    }
                    break;
                case 3:
                    System.out.println("Nhập nơi xuất sứ ");
                    origin = sc.nextLine().trim();
                    if (origin.matches("[a-zA-Z ]+")) {
                        ++count;
                    } else {
                        System.out.println("Bạn nhập không hợp lệ:");
                    }
                    break;
            }
        } while (count != 4);
        arrayProduct.add(new Product(id, nameProduct, Double.parseDouble(price), origin));
        productRepository.writeProduct(arrayProduct);
    }

    @Override
    public void findProduct() {
        System.out.println("Bạn nhập tên muốn tìm kiếm :");
        String nameProduct = sc.nextLine().trim();
        for (Product p : arrayProduct) {
            if (p.getNameProduct().equals(nameProduct)) {
                System.out.println("Sản phẩm bạn tìm ");
                System.out.println("+-------------------------------------------------+");
                System.out.println("| Id    | Tên sản phẩm | Gía tiền  | Nơi sản xuất |");
                System.out.println("+-------+--------------+-----------+--------------+");
                System.out.printf("|%-7s|%-14s|%11s|%-14s|\n", p.getId(), p.getNameProduct(), p.getPrice(), p.getOrigin());
                System.out.println("+-------------------------------------------------+");
                break;
            }
        }
        System.out.printf("Sản phẩm bạn không tồn tại :");
    }
}
