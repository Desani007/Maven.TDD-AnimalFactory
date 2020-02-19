package rocks.zipcodewilmington;

import org.junit.*;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    public  Cat cat;
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

  @After
  public  void init(){
      CatHouse catHouse = new CatHouse();
      catHouse.remove(cat);
  }

    @Test
    public void addTest(){
        CatHouse catHouse = new CatHouse();


        catHouse.add(cat);
        int  expected =1;
        int actual= CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
     }
 @Test
    public void removeIdTest(){
     CatHouse catHouse = new CatHouse();

     Cat cat2 = new Cat(null, null, 2);
      catHouse.add(cat2);
     catHouse.remove(2);

        int  expected =0;
        int actual= catHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        CatHouse catHouse = new CatHouse();


        catHouse.add(cat);
         catHouse.remove(cat);

        int expected=0;
        int actual = catHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void getCatByIdTest(){
        CatHouse catHouse = new CatHouse();

        Cat cat2 = new Cat(null, null, 2);


        catHouse.add(cat2);
        int  expected =2;
        catHouse.getCatById(2);
        int actual = cat2.getId();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        CatHouse catHouse = new CatHouse();

        catHouse.add(cat);
        int  expected =1;
        int actual =catHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }


}
