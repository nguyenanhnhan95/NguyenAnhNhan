package ss11_map_binary.bai_tap.manage_product.respository;

import ss11_map_binary.bai_tap.manage_product.model.Product;

import java.util.List;

public interface IProductRepository<E> {
    List<E> getList();

    void addProduct(E e);

    void setInformation(E e, int index);

    void deleteProduct(E e);
}
