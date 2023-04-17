package ss11_map_binary.bai_tap.manage_product.service;

import java.util.List;

public interface IProduct<E>{
    List<E> getList();
    void addProduct();
    void setInformation();
    void deleteProduct();
    void findProduct();
    void sortIncrease();
    void sortDecrease();
}
