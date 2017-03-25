package designPattern.factory;


public class PlantFactory {

    public Plant createPlant(PlantVariety variety) {
        if (PlantVariety.APPLE == variety) {
            return new Apple();
        } else if (PlantVariety.POTATO == variety) {
            return new Potato();
        }
        return new Tomato();
    }
}
