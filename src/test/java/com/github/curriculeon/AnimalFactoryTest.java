package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import com.github.curriculeon.animals.Dog;
import com.github.curriculeon.animals.animal_creation.AnimalFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest() {
        //Given
        String expectedName = "NightNight";
        Date expectedDate = new Date();

        //When
        Cat cat = AnimalFactory.createCat(expectedName,expectedDate);
        String actualName = cat.getName();
        Date actualDate = cat.getBirthDate();

        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate,actualDate);
    }

    @Test
    public void createDogTest() {
        //Given
        String expectedName = "Niko";
        Date expectedDate = new Date();

       //When
       Dog dog = AnimalFactory.createDog(expectedName,expectedDate);
       String actualName = dog.getName();
       Date actualDate = dog.getBirthDate();

       //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
