package ss13_sort_algorithm.bai_tap.manage_fruit.repository;

import ss13_sort_algorithm.bai_tap.manage_fruit.model.Fruit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FruitRepository implements IFruitRepository<Fruit> {
    private static List<Fruit> fruits = new ArrayList<Fruit>();

    static {
        Fruit fruitOne = new Fruit("Tao", 1, LocalDate.of(2023, 5, 19), LocalDate.of(2023, 4, 19), "TayNinh", 500);
        Fruit fruitTwo = new Fruit("Cam", 3, LocalDate.of(2023, 6, 19), LocalDate.of(2023, 4, 19), "AnGiang", 6000);
        Fruit fruitThree = new Fruit("SauRieng", 3, LocalDate.of(2023, 12, 19), LocalDate.of(2023, 4, 19), "KonTum", 1500);
        fruits.add(fruitOne);
        fruits.add(fruitTwo);
        fruits.add(fruitThree);
    }

    @Override
    public List<Fruit> getList() {
        return fruits;
    }

    @Override
    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    @Override
    public void deleteFruit(int index) {
        fruits.remove(index);
    }

    @Override
    public boolean editFruit(String name) {
        for (Fruit a : fruits) {
            if (a.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
