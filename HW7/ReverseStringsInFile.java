package HW7;

import java.io.*;
import java.util.*;

//TASK1
public class ReverseStringsInFile {

    public static void main(String[] args) {
        // File to read and write
        String fileName = "input.txt";

        try {
            // Read the strings from the file into a list
            List<String> strings = readStringsFromFile(fileName);

            // Reverse the list
            Collections.reverse(strings);

            // Write the strings back to the file in the opposite order
            writeStringsToFile(strings, fileName);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static List<String> readStringsFromFile(String fileName) throws IOException {
        List<String> strings = new ArrayList<>();

        // Open the file for reading
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        // Read each line from the file and add it to the list
        String line;
        while ((line = reader.readLine()) != null) {
            strings.add(line);
        }

        // Close the file
        reader.close();

        return strings;
    }

    private static void writeStringsToFile(List<String> strings, String fileName) throws IOException {
        // Open the file for writing
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        // Write each string from the list to the file in reverse order
        for (int i = strings.size() - 1; i >= 0; i--) {
            writer.write(strings.get(i));
            writer.newLine();
        }

        // Close the file
        writer.close();
    }
}

