package designPattern.factory;


public class Apple extends Plant {

    public Apple() {
        this.name = "Apple";
    }

    @Override
    void putWater() {
        this.water = 6;
    }

    @Override
    void putFertilizer() {
        this.fertilizer = 7;
    }
}
