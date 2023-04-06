package HW4;

import java.util.ArrayList;
import java.util.List;

public class Greenhouse {
    int balance = 10000;
    int temperature = 30;

    List<Plant> plants = new ArrayList<Plant>();

    void buyNewPlant(Plant plant) {
        this.plants.add(plant);
        System.out.println("Plant is bought");
    }

    void waterPlants() {
        for (Plant plant : plants) {
            plant.waterPlant();
        }
        System.out.println("Plants watered");
    }

    void changeTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature changed to " + temperature);
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
