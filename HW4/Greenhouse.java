package HW4;

import java.util.ArrayList;
import java.util.List;

public class Greenhouse {
    int balance = 10000;
    int temperature = 30;

    List<Plant> plants = new ArrayList<Plant>();

    void buyNewPlant(String plant) {

        if (!plant.equals("bonsai") && !plant.equals("raspberry") && !plant.equals("rose")) {
            System.out.println("Invalid plant");
        } else if (plant.equals("bonsai")) {
            plants.add(new Bonsai(plants.size()));
            this.balance = this.balance - Bonsai.price;
            System.out.println("Bought bonsai");
        } else if (plant.equals("raspberry")) {
            plants.add(new Raspberry(plants.size()));
            this.balance = this.balance - Raspberry.price;
            System.out.println("Bought raspberry");

        } else {
            plants.add(new Rose(plants.size()));
            this.balance = this.balance - Rose.price;
            System.out.println("Bought rose");

        }
    }

    void waterPlants() {
        for (Plant plant : plants) {
            plant.waterPlant();
        }
        System.out.println("Plants watered");
    }

    void changeTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature changed to " +temperature);
    }

    void removeAPlant(int id) {
        plants.removeIf(plant -> plant.id == id);
        System.out.println("Plant is removed");
    }

    void retrievePlantsFromJP() {
        for (Plant plant : this.plants) {
            if (plant.nativeRegion.equals("JP")) {
                System.out.println("Type is JP");
            }
        }
    }
}
