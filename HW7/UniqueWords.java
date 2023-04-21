package HW7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TASK 4
public class UniqueWords {
    public static void main(String[] args) {
        // Change the file path to the location of your text file
        File file = new File("path/to/your/textfile.txt");

        // Create a HashSet to store the unique words
        Set<String> uniqueWords = new HashSet<>();

        try {
            // Use a Scanner to read the text file line by line
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                // Read each line of the file and split it into words
                String[] words = scanner.nextLine().split("\\s+");

                // Add each word to the HashSet
                for (String word : words) {
                    uniqueWords.add(word);
                }
            }

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Print out the unique words
        System.out.println("Unique words in the file:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
