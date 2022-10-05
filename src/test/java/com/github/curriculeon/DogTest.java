package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.animals.Dog;

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
    public void getIdTest() {
        //Given
        Integer expected = 3;
        Dog dog = new Dog(null, null, expected);
        //When
        dog.getId();
        Integer actual = dog.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        //Given
        Food food = new Food();
        Dog dog = new Dog(null, null, null);
        int startNumberOfMeals = dog.getNumberOfMealsEaten();
        int expected = startNumberOfMeals + 1;

        //When
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();


        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        //Given
        String expected = "bark!";
        Dog dog = new Dog(null, null, null);

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        //Given
        Date expectedBirthDate = new Date();
        Dog dog = new Dog(null, null, null);

        //When
        dog.setBirthDate(expectedBirthDate);
        Date actualBirthDate = dog.getBirthDate();


        //Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);

    }

    //@Test
    //public void setNameTest() {
        //Given name
       // String expectedName = "Milo";

        // Given create cat
       //Dog dog = new Dog(null, null, null);

        //When cat name sets to CatName
        //dog.setName(expectedName);
        //String actualName = dog.getName();

        //Then
       // Assert.assertEquals(expectedName, actualName);




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
}
