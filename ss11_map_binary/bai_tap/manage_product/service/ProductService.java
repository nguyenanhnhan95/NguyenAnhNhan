package ss11_map_binary.bai_tap.manage_product.service;

import ss11_map_binary.bai_tap.manage_product.model.Product;
import ss11_map_binary.bai_tap.manage_product.responsitory.ProductRepository;


import java.util.*;

public class ProductService implements IProduct<Product> {
    private Scanner sc = new Scanner(System.in);
    private ProductRepository productResponsitory = new ProductRepository();

    @Override
    public void getList() {
        System.out.printf("-------------------------------%n");
        System.out.printf("| ID  |   Name  |     Price   |%n");
        for (Product product : productResponsitory.getList()) {
            System.out.printf("|-----------------------------|%n");
            System.out.printf("| %-3s | %-8s| %-12s|", product.getId(), product.getName(), product.getPrice());
            System.out.println("");
        }
        System.out.printf("-------------------------------%n");
    }

    @Override
    public void addProduct() {
        System.out.println("Nhập ID :");
        String id = sc.nextLine();
        System.out.println("Nhập Tên :");
        String name = sc.nextLine();
        System.out.println("Nhập Gía :");
        Double price = Double.parseDouble(sc.nextLine());
        productResponsitory.addProduct(new Product(name, price, id));
    }

    @Override
    public boolean setInformation() {
        System.out.println("Nhập Id để chỉnh sửa thông tin :");
        String id = sc.nextLine();
        int count = 0;
        for (Product product : productResponsitory.getList()) {
            if (product.getId().equals(id)) {
                System.out.println("Nhập tên muốn thay đổi :");
                String name = sc.nextLine();
                System.out.println("Nhập giá muốn thay đổi :");
                Double price = Double.parseDouble(sc.nextLine());
                productResponsitory.setInformation(name, price, count);
                return true;
            }
            count++;
        }
        return false;
    }

    @Override
    public boolean deleteProduct() {
        System.out.println("Nhập Id để xóa product :");
        String id = sc.nextLine();
        for (Product product : productResponsitory.getList()) {
            if (product.getId().equals(id)) {
                productResponsitory.deleteProduct(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean findProduct() {
        System.out.println("Nhập Tên để tìm product :");
        String name = sc.nextLine();
        for (Product product : productResponsitory.getList()) {
            if (product.getName().equals(name)) {
                System.out.println(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public void sortIncrease() {
        Collections.sort(productResponsitory.getList(), new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() < p2.getPrice()) {
                    return -1;
                } else if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    @Override
    public void sortDecrease() {
        Collections.sort(productResponsitory.getList(), new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() > p2.getPrice()) {
                    return -1;
                } else if (p1.getPrice() < p2.getPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }


}

