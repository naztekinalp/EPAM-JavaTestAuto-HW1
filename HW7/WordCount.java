package HW7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

//TASK 5
public class WordCount {
    public static void main(String[] args) {
        String fileName = "input_task1.txt"; // replace with the name of your text file
        HashMap<String, Integer> wordCounts = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();

            while (line != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase(); // convert to lowercase to ignore case sensitivity
                        if (wordCounts.containsKey(word)) {
                            wordCounts.put(word, wordCounts.get(word) + 1);
                        } else {
                            wordCounts.put(word, 1);
                        }
                    }
                }
                line = reader.readLine();
            }
            reader.close();
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", fileName);
            e.printStackTrace();
        }

        System.out.println(wordCounts); // print the word counts to the console

        // you can save the word counts to a file or do further processing here
    }
}
