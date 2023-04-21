package HW7;

import java.util.*;
//TASK 2
public class SortPoem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> lines = new ArrayList<>();

        // Read in the poem line by line
        System.out.println("Enter the poem (type \"0\" on a new line to finish):");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("0")) {
                break;
            }
            lines.add(line);
        }

        // Sort the lines by length
        lines.sort(Comparator.comparing(String::length));

        // Print out the sorted lines
        System.out.println("Sorted poem:");
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
