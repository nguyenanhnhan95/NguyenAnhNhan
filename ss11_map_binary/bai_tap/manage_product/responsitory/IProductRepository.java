package ss11_map_binary.bai_tap.manage_product.responsitory;

import java.util.List;

public interface IProductRepository<E> {
    List<E> getList();

    void addProduct(E e);

    void setInformation(String name, Double price, int index);

    void deleteProduct(E e);
}
