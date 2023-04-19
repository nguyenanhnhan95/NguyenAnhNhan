package ss13_sort_algorithm.bai_tap.manage_fruit.repository;

import java.util.List;

public interface IFruitRepository<E> {
    List<E> getList();

    void addFruit(E e);

    void deleteFruit(int index);

    boolean editFruit(String name);
}
