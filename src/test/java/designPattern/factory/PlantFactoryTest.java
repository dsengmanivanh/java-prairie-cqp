package designPattern.factory;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlantFactoryTest {


    @Test
    public void createPlant_without_variety() {
        //set
        PlantFactory plantFactory = new PlantFactory();
        //test
        Plant plant = plantFactory.createPlant(PlantVariety.TOMATO);
        //assert
        Tomato expected = new Tomato();
        assertEquals(expected, plant);
    }

    @Test
    public void createPlant_with_potato() {
        //set
        PlantFactory plantFactory = new PlantFactory();
        //test
        Plant plant = plantFactory.createPlant(PlantVariety.POTATO);
        //assert
        Potato expected = new Potato();
        assertEquals(expected, plant);
    }

    @Test
    public void createPlant_with_apple() {
        //set
        PlantFactory plantFactory = new PlantFactory();
        //test
        Plant plant = plantFactory.createPlant(PlantVariety.APPLE);
        //assert
        Apple apple = new Apple();
        assertEquals(apple, plant);
    }

}