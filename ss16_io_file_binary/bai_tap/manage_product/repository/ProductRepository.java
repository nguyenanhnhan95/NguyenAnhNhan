package ss16_io_file_binary.bai_tap.manage_product.repository;

import ss16_io_file_binary.bai_tap.manage_product.common.Common;
import ss16_io_file_binary.bai_tap.manage_product.model.Product;

import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository<Product> {
    private static final String PATH = "D:\\Codegym\\Module2\\src\\ss16_io_file_binary\\bai_tap\\manage_product\\data\\data.csv";
    private Scanner sc = new Scanner(System.in);
    private Common<Product> common = new Common();

    @Override
    public void writeProduct(List<Product> products) {
        common.writeFile(PATH, products);
    }

    @Override
    public List<Product> readProduct() {
        return common.readFile(PATH);
    }


}
