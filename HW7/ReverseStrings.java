package HW7;

import java.io.*;
import java.util.*;

//TASK1
public class ReverseStrings {

    public static void main(String[] args) {
        String inputFile = "./HW7/input_task1.txt";
        String outputFile = "./HW7/output_task1.txt";

        List<String> strings = readStringsFromFile(inputFile);

        Collections.reverse(strings);

        writeStringsToFile(strings, outputFile);
    }

    private static List<String> readStringsFromFile(String filename) {
        List<String> strings = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                strings.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    private static void writeStringsToFile(List<String> strings, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (String s : strings) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
