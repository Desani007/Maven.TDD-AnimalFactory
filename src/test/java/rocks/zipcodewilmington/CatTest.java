package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        String expected = "jimmy";

   Cat testing = new Cat(expected,null,null);
   String actual = testing.getName();
   Assert.assertEquals(expected,actual);

    }

    @Test
    public void setBirthDateTest() throws ParseException {

        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateformat.parse("1994-04-26");
        Cat testing = new Cat(null,date,null);
         Date actual = testing.getBirthDate();
        Assert.assertEquals(date,actual);

    }

    @Test
    public void speakTest(){
        Cat testCat = new Cat(null,null,null);
        String expected ="meow!";
        String actual = testCat.speak();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public  void eatTest (){
        Cat testCat = new Cat(null,null,null);
        Integer expected =1;
        Food food = new Food();
        testCat.eat(food);
       Integer actual = testCat.getNumberOfMealsEaten();
       Assert.assertEquals(expected,actual);

    }
    @Test
    public void getIdTest() throws ParseException {

       Integer expected =1;
        Cat testing = new Cat(null,null,1);
        Integer actual=testing.getId();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void isAnimalInstanceOfTest (){
        Cat cat = new Cat(null,null,null);
        boolean actual= cat.isInstanceOfAnimal();
        Assert.assertTrue(actual);
    }

    @Test
    public void isMammalInstanceOfTest (){
        Cat cat = new Cat(null,null,null);
        boolean actual= cat.isInstanceOfMammal();
        Assert.assertTrue(actual);
    }


}
