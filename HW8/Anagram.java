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
        boolean result = anagramFunction.areAnagrams("listen", "silent"); // result will be true
        System.out.println(result);
    }


}
