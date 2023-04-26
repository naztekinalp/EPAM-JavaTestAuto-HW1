package HW8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStrings {

    public static void main(String[] args) {
        String inputFile = "./HW7/input_task1.txt";
        String outputFile = "./HW7/output_task1.txt";

        List<String> strings = readStringsFromFile(inputFile);

        Collections.reverse(strings);

        writeStringsToFile(strings, outputFile);
    }

    private static List<String> readStringsFromFile(String filename) {
        List<String> strings = Collections.emptyList();
        try {
            strings = Files.lines(Paths.get(filename)).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return strings;
    }

    private static void writeStringsToFile(List<String> strings, String filename) {
        try {
            Files.write(Paths.get(filename), strings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
