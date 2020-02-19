package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Cat extends Mammal {



    public Cat(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);

    }


    public String speak() {
        return "meow!";
    }


    public boolean isInstanceOfAnimal() {
        Cat cat = new Cat(null ,null,null);
        return cat instanceof Animal;
    }
    public boolean isInstanceOfMammal() {
        Cat cat = new Cat(null ,null,null);
        return cat instanceof Mammal;
    }
}
