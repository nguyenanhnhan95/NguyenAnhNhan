package ss11_map_binary.bai_tap.manage_product;

public abstract class Product<P> {
    private String id;
    private String nameProduct;
    public Product(){}

    public Product(String id, String nameProduct) {
        this.id = id;
        this.nameProduct = nameProduct;
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
}
