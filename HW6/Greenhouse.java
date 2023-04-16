package HW6;

import java.io.*;
import java.util.*;

public class Greenhouse {
    private static List<Plant> plants = new ArrayList<>();
    private static final String FILENAME = "./HW6/plants.txt";

    public static void main(String[] args) {

        readFile();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1:  Add a new plant to the greenhouse");
            System.out.println("2 - Remove a plant from the greenhouse");
            System.out.println("3 - Find a plant in the greenhouse by any parameter");
            System.out.println("4 - Quit");


            try {
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        addPlant(scanner);
                        break;
                    case 2:
                        removePlant(scanner);
                        break;
                    case 3:
                        findPlant(scanner);
                        break;
                    case 4:
                        writeFile();
                        System.exit(0);
                    default:
                        throw new InvalidOptionException("Invalid option is selected.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer option.");
            } catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static class InvalidOptionException extends Exception {
        public InvalidOptionException() {
        }

        public InvalidOptionException(String message) {
            super(message);
        }
    }

    private static void addPlant(Scanner scanner) {
        System.out.println("Please enter a plant name:");
        String name = scanner.nextLine();

        System.out.println("Please enter a plant type:");
        String type = scanner.nextLine();

        System.out.println("Please enter a plant quantity:");
        int quantity = Integer.parseInt(scanner.nextLine());

        Plant plant = new Plant(name, type, quantity);
        plants.add(plant);
        System.out.println("New plant is added to the greenhouse.");
    }

    private static void removePlant(Scanner scanner) {
        System.out.println("Enter plant name:");
        String name = scanner.nextLine();

        Iterator<Plant> iterator = plants.iterator();
        while (iterator.hasNext()) {
            Plant plant = iterator.next();
            if (plant.getName().equals(name)) {
                iterator.remove();
                System.out.println("Plant is removed from the greenhouse.");
                return;
            }
        }
        System.out.println("No plant with name " + name + " found in the greenhouse.");
    }

    private static void findPlant(Scanner scanner) {
        System.out.println("Enter a plant parameter for search. (Parameters: name, type and quantity) :");
        String parameter = scanner.nextLine().toLowerCase();

        System.out.println("Enter value for " + parameter + ":");
        String value = scanner.nextLine().toLowerCase();

        List<Plant> matchingPlants = new ArrayList<>();
        for (Plant plant : plants) {
            switch (parameter) {
                case "name":
                    if (plant.getName().toLowerCase().equals(value)) {
                        matchingPlants.add(plant);
                    }
                    break;
                case "type":
                    if (plant.getType().toLowerCase().equals(value)) {
                        matchingPlants.add(plant);
                    }
                    break;
                case "quantity":
                    if (Integer.toString(plant.getQuantity()).toLowerCase().equals(value)) {
                        matchingPlants.add(plant);
                    }
                    break;
                default:
                    System.out.println("Invalid parameter is selected.");
                    return;
            }
        }

        if (matchingPlants.isEmpty()) {
            System.out.println("No plants found with " + parameter + " of " + value + ".");
        } else {
            System.out.println("Plants matching " + parameter + " of " + value + ":");
            for (Plant plant : matchingPlants) {
                System.out.println(plant);
            }
        }
    }

    private static void readFile() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILENAME))) {
            plants = (List<Plant>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No plant record found. Will be updated when plant is added.");
        }
    }

    private static void writeFile() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            out.writeObject(plants);
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
