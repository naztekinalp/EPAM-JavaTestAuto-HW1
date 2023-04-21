package HW7;

import java.io.*;
import java.util.*;

//TASK 5
public class WordCount {

    public static void main(String[] args) {

        Map<String, Integer> wordCounts = new HashMap<>();

        String filePath = "./HW7/input_task5.txt";

        try {
            Scanner scanner = new Scanner(new File(filePath));

            while (scanner.hasNext()) {
                String word = scanner.next();

                if (wordCounts.containsKey(word)) {
                    int count = wordCounts.get(word);
                    wordCounts.put(word, count + 1);
                } else {

                    wordCounts.put(word, 1);
                }
            }

            for (String word : wordCounts.keySet()) {
                int count = wordCounts.get(word);
                System.out.println(word + ": " + count);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        }
    }
}
