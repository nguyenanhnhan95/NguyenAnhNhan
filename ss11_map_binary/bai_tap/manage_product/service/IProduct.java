package ss11_map_binary.bai_tap.manage_product.service;

import java.util.List;

public interface IProduct<E> {
    void getList();

    void addProduct();

    boolean setInformation();

    boolean deleteProduct();

    boolean findProduct();

    void sortIncrease();

    void sortDecrease();
}
