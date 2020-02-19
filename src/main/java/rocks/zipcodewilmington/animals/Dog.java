package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }

    public boolean isInstanceOfAnimal() {
        Dog dog = new Dog(null, null, null);
        return dog instanceof Animal;
    }

    public boolean isInstanceOfMammal() {
        Dog dog = new Dog(null, null, null);
        return dog instanceof Mammal;
    }
}