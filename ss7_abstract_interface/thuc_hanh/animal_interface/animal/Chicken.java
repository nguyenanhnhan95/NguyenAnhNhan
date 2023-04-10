package ss7_abstract_interface.thuc_hanh.animal_interface.animal;

import ss7_abstract_interface.thuc_hanh.animal_interface.edible.Edible;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken : cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
