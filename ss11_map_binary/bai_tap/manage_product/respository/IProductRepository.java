package ss11_map_binary.bai_tap.manage_product.respository;

import ss11_map_binary.bai_tap.manage_product.model.Product;

import java.util.List;

public interface IProductRepository<E> {
    List<E> getList();

    void addProduct(E e);

    int setInformation(String id);

    void deleteProduct(E e);
}
