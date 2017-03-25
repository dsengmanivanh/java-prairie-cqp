package designPattern.factory;


import java.util.Objects;

public abstract class Plant {

    protected String name;
    protected int water;
    protected int fertilizer;

    abstract void putWater();

    abstract void putFertilizer();

    public String getName() {
        return name;
    }

    public int getWater() {
        return water;
    }

    public int getFertilizer() {
        return fertilizer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return water == plant.water &&
                fertilizer == plant.fertilizer &&
                Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, water, fertilizer);
    }
}
