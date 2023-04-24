package ss16_io_file_binary.bai_tap.manage_product.repository;

import java.util.List;

public interface IProductRepository<E> {
    void writeProduct(List<E> e);

    List<E> readProduct();
}
