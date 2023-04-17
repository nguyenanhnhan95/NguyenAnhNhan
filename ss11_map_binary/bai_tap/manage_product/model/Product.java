package ss11_map_binary.bai_tap.manage_product.model;

public class Product {
    private String name;
    private double price =0.0d;
    private String id;

    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    public Product(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}
