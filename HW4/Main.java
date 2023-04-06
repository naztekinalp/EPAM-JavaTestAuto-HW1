package HW4;

public class Main {
    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();

        greenhouse.buyNewPlant("bonsai");
        greenhouse.buyNewPlant("raspberry");
        greenhouse.buyNewPlant("rose");

        greenhouse.waterPlants();

        greenhouse.changeTemperature(35);

        greenhouse.removeAPlant(1);

        greenhouse.retrievePlantsFromJP();

    }
}
