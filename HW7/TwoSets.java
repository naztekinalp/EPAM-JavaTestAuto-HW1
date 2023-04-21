package HW7;

import java.util.*;

//TASK 3
public class TwoSets {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union of Set 1 and Set 2: " + unionSet);

        Set<Integer> intersectionSet = intersection(set1, set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet);
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<Integer>();
        unionSet.addAll(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<Integer>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
