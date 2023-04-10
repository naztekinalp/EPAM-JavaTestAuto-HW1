package HW5;

public class Main {

    public static void main(String[] args) {

        Greenhouse greenhouse = new Greenhouse() {
            @Override
            void changeTemperature(int temperature) {
                System.out.println("Temperature system is broken! Can not change temperature at the moment.");
            }
        };

        Bonsai bonsai = new Bonsai(1);
        bonsai.updateNationRegion("China");

        Raspberry raspberry = new Raspberry(2);
        raspberry.updateNationRegion("Canada");
        raspberry.harvest();

        Rose rose = new Rose(3);
        rose.thorns = new Rose.Thorns();
        rose.thorns.addThorn();
        rose.updateType("Red rose");
        rose.flower();

        greenhouse.buyNewPlant(bonsai);
        greenhouse.buyNewPlant(raspberry);
        greenhouse.buyNewPlant(rose);

        greenhouse.waterPlants();

        greenhouse.changeTemperature(35);

        greenhouse.removeAPlant(1);

        greenhouse.retrievePlantsFromJP();
    }
}
