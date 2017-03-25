package designPattern.factory;


public class Potato extends Plant {
    public Potato() {
        this.name = "Potato";
    }

    @Override
    void putWater() {
        this.water = 1;
    }

    @Override
    void putFertilizer() {
        this.fertilizer = 5;
    }
}
