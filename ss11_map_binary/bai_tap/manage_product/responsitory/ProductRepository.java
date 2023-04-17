package ss11_map_binary.bai_tap.manage_product.responsitory;

import ss11_map_binary.bai_tap.manage_product.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository<Product> {
    private Scanner sc = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    static {
        Product product1 = new Product("Apple", 250000, "Ip1");
        Product product2 = new Product("SamSum", 240000, "S1");
        Product product3 = new Product("Remi", 240000, "R1");
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    @Override
    public List<Product> getList() {
        return products;
    }

    @Override
    public void addProduct(Product productNew) {
        products.add(productNew);
    }

    @Override
    public void setInformation(String name, Double price, int index) {
        products.get(index).setName(name);
        products.get(index).setPrice(price);
    }

    @Override
    public void deleteProduct(Product product) {
        products.remove(product);
    }
}
