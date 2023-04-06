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
        } else if (plant.equals("raspberry")) {
            plants.add(new Raspberry(plants.size()));
            this.balance = this.balance - Raspberry.price;
        } else {
            plants.add(new Rose(plants.size()));
            this.balance = this.balance - Rose.price;
        }
    }

    void waterPlants() {
        for (Plant plant : plants) {
            plant.waterPlant();
        }
    }

    void changeTemperature(int temperature) {
        this.temperature = temperature;
    }

    void removeAPlant(int id) {
        plants.removeIf(plant -> plant.id == id);
    }

    void retrievePlantsFromJP() {
        for (Plant plant : this.plants) {
            if (plant.nativeRegion.equals("JP")) {
                System.out.println("Type is JP");
            }
        }
    }
}
