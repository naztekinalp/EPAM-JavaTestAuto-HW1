package HW4;

public class Main {
    public static void main(String[] args) {
        Greenhouse greenhouse = new Greenhouse();

        Bonsai bonsai = new Bonsai(1);
        bonsai.updateNationRegion("China");

        Raspberry raspberry = new Raspberry(2);
        raspberry.updateNationRegion("Canada");
        raspberry.harvest();

        Rose rose = new Rose(3);
        rose.updateType("Red rose");

        greenhouse.buyNewPlant(bonsai);
        greenhouse.buyNewPlant(raspberry);
        greenhouse.buyNewPlant(rose);

        greenhouse.waterPlants();

        greenhouse.changeTemperature(35);

        greenhouse.removeAPlant(1);

        greenhouse.retrievePlantsFromJP();
    }
}
