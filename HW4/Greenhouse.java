package HW4;

import java.util.ArrayList;
import java.util.List;

public class Greenhouse {
    int balance = 10000;
    int temperature = 30;

    List<Plant> plants = new ArrayList<Plant>();

    void buyNewPlant(String plant) {

        if (!plant.equals("bonsai") || !plant.equals("raspberry") || !plant.equals("rose")) {
            System.out.println("Invalid plant");
            return;
        }
        if (plant.equals("bonsai")) {
            plants.add(new Bonsai(plants.size()));
            this.balance = this.balance - Bonsai.price;
            return;
        }
        if (plant.equals("raspberry")) {
            plants.add(new Raspberry(plants.size()));
            this.balance = this.balance - Raspberry.price;
            return;
        }
        if (plant.equals("rose")) {
            plants.add(new Rose(plants.size()));
            this.balance = this.balance - Rose.price;
            return;
        }

    }

    void waterPlants() {
        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).waterPlant();
        }
    }

    void changeTemperature(int temperature) {
        this.temperature = temperature;
    }

    void removeAPlant(int id) {
        for (int i = 0; i < this.plants.size(); i++) {
            if (this.plants.get(i).id == id) {
                this.plants.remove((this.plants.get(i)));
            }
        }
    }

    void retrievePlantsFromJP() {
        for (Plant plant : this.plants) {
            if (plant.nativeRegion == "JP") {
                System.out.println("Type is JP");
            }
        }
    }

}
