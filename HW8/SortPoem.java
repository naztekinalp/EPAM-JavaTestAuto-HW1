package HW8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortPoem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> lines = new ArrayList<>();

        System.out.println("Enter a poem (Type '0' on a new line to terminate the program):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("0")) {
                break;
            }
            lines.add(line);
        }

        List<String> sortedLines = lines.stream()
                .sorted(Comparator.comparing(String::length))
                .toList();

        System.out.println("Sorted poem(by its length) is as follows:");
        sortedLines.forEach(System.out::println);
    }
}


