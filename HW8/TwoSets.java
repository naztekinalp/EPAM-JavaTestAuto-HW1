package HW8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoSets {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(0, 1, 3, 5, 7));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2, 4, 5, 7, 8));

        System.out.println("Set 1 is: " + set1);
        System.out.println("Set 2 is: " + set2);
        System.out.println();

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union of the Set 1 and Set 2: " + unionSet);

        Set<Integer> intersectionSet = intersection(set1, set2);
        System.out.println("Intersection of the Set 1 and Set 2: " + intersectionSet);
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        return Stream.concat(set1.stream(), set2.stream())
                .collect(Collectors.toSet());
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        return set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
    }
}

