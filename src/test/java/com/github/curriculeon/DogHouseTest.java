package com.github.curriculeon;

import com.github.curriculeon.animals.Dog;
import com.github.curriculeon.animals.animal_creation.AnimalFactory;
import com.github.curriculeon.animals.animal_storage.CatHouse;
import com.github.curriculeon.animals.animal_storage.DogHouse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Before
    public void setup() {
        DogHouse.clear();
    }

    @Test
    public void getNumberOfDogs() {
        //Given
        Integer expectedNumberOfDogs = DogHouse.getNumberOfDogs();
        Dog expectedDog = new Dog(null, null, null);

        //When
        DogHouse.add(expectedDog);
        Integer actualNumberOfDogS = DogHouse.getNumberOfDogs();
        expectedNumberOfDogs = expectedNumberOfDogs + 1;


        //Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogS);
    }


    @Test
    public void removeDogByIdTest() {
        //Given
        Integer expectedId = 0;
        Dog expectedDog = new Dog(null, null, expectedId);
        DogHouse.add(expectedDog);
        //When
        DogHouse.remove(expectedId);
        Dog actualDog = DogHouse.getDogById(expectedId);


        //Then
        Assert.assertNull(actualDog);
    }

    @Test
    public void addDogByIdTest() {
        //Given
        Integer expectedId = 0;
        Dog expectedDog = new Dog(null, null, expectedId);


        //When
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(expectedId);


        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
