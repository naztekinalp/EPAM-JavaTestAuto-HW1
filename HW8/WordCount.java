package HW8;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {
        String filePath = "./HW8/input_task5.txt";
        Path path = Path.of(filePath);

        try {
            Map<String, Long> wordCounts = Files.lines(path)
                    .flatMap(line -> Arrays.stream(line.trim().split("\\s+")))
                    .collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));

            wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




