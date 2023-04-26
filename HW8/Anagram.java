package HW8;

import java.util.Arrays;

public class Anagram {
    @FunctionalInterface
    public interface AnagramFunction {
        boolean areAnagrams(String word1, String word2);
    }

    public static void main(String[] args) {
        AnagramFunction anagramFunction = (word1, word2) -> {
            if (word1.length() != word2.length()) {
                return false;
            }
            char[] word1Chars = word1.toLowerCase().toCharArray();
            char[] word2Chars = word2.toLowerCase().toCharArray();
            Arrays.sort(word1Chars);
            Arrays.sort(word2Chars);
            return Arrays.equals(word1Chars, word2Chars);
        };

        boolean result1 = anagramFunction.areAnagrams("shore", "horse");
        boolean result2 = anagramFunction.areAnagrams("sleep", "night");
        boolean result3 = anagramFunction.areAnagrams("cat", "dog");
        boolean result4 = anagramFunction.areAnagrams("sneak", "snake");
        boolean result5 = anagramFunction.areAnagrams("balm", "lamb");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
