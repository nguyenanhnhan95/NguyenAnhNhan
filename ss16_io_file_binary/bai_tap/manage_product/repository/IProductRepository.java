package ss16_io_file_binary.bai_tap.manage_product.repository;

import java.util.List;

public interface IProductRepository<E> {
    void addProduct(List<E> e);

    List<E> getProductList();
}
