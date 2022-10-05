package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.animal_storage.CatHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Before
    public void setup() {
        CatHouse.clear();
    }

    @Test
    public void removeCatByIdTest() {
        //Given
        Integer expectedId = 0;
        Cat expectedCat = new Cat(null,null,expectedId);
        CatHouse.add(expectedCat);

        //When
        CatHouse.remove(expectedCat);
        Cat actualCat = CatHouse.getCatById(expectedId);

        //Then
        Assert.assertNull(actualCat);
    }
    @Test
    public void addCatTest() {
        //Given
        Integer expectedId = 0;
        Cat expectedCat = new Cat(null, null, expectedId);

        //When
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(expectedId);


        //Then
        Assert.assertEquals(expectedCat, actualCat);
    }


}

