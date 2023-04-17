package ss11_map_binary.bai_tap.manage_product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager extends Product{
    private List<Product> productList= new ArrayList<>();
    public ProductManager() {
    }

    public ProductManager(String id, String nameProduct) {
        super(id, nameProduct);
    }

}
