package ss16_io_file_binary.bai_tap.manage_product.model;

import java.io.Serializable;

public class Product implements Serializable {
    private String id;
    private String nameProduct;
    private double price;
    private String origin;

    public Product() {
    }

    public Product(String id, String nameProduct, double price, String origin) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.origin = origin;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                '}';
    }
}
