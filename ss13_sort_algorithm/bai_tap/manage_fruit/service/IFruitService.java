package ss13_sort_algorithm.bai_tap.manage_fruit.service;

import java.util.List;

public interface IFruitService<E> {
    List<E> getList();

    void add();

    void display();

    String delete();

    void sortIncrease();

    void sortDecrease();

    String editFruit();
}
