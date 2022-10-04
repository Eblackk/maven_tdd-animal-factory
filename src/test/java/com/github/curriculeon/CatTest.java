package com.github.curriculeon;

import com.github.curriculeon.animals.Cat;
import org.junit.Assert;
import org.junit.Test;

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
    public void getIdTest() {
        //Given
        Integer expected = 3;
        Cat cat = new Cat(null,null,expected);
        //When
        cat.getId();
        Integer actual = cat.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest() {
        //Given
        Food food = new Food();
        Cat cat = new Cat(null,null,null);
        int startNumberOfMeals = cat.getNumberOfMealsEaten();
        int expected = startNumberOfMeals + 1;

        //When
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();


        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest() {
        //Given
        String expected = "meow!";
        Cat cat = new Cat(null, null, null);

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        //Given
        Date expectedBirthDate = new Date();
        Cat cat = new Cat(null, null, null);

        //When
        cat.setBirthDate(expectedBirthDate);
        Date actualBirthDate = cat.getBirthDate();


        //Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);

    }

    @Test
    public void setNameTest() {
        //Given name
        String expectedName = "MidNight";

        // Given create cat
        Cat cat = new Cat(null, null, null);

        //When cat name sets to CatName
        cat.setName(expectedName);
        String actualName = cat.getName();

        //Then
        Assert.assertEquals(expectedName, actualName);


    }

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

}
