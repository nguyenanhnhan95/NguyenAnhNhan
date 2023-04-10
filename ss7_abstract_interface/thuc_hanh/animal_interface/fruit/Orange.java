package ss7_abstract_interface.thuc_hanh.animal_interface.fruit;

import ss7_abstract_interface.thuc_hanh.animal_interface.edible.Edible;

public class Orange extends Fruit {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}
