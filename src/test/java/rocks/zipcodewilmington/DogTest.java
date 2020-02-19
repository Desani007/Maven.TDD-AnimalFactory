package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest() throws ParseException {

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateformat.parse("1994-04-26");
        Dog testDog = new Dog(null,date,null);
        Date actual = testDog.getBirthDate();
        Assert.assertEquals(date,actual);

    }

    @Test
    public void speakTest(){
        Dog testDog = new Dog(null,null,null);
        String expected ="bark!";
        String actual = testDog.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public  void eatTest (){
        Dog testDog = new Dog(null,null,null);
        Integer expected =1;
        Food food = new Food();
        testDog.eat(food);
        Integer actual = testDog.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void getIdTest() throws ParseException {

        Integer expected =1;
        Dog testDog = new Dog(null,null,1);
        Integer actual=testDog.getId();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void isAnimalInstanceOfTest (){
        Dog testDog = new Dog(null,null,null);
        boolean actual= testDog.isInstanceOfAnimal();
        Assert.assertTrue(actual);
    }

    @Test
    public void isMammalInstanceOfTest (){
        Dog testDog = new Dog(null,null,null);
        boolean actual= testDog.isInstanceOfMammal();
        Assert.assertTrue(actual);
    }
}
