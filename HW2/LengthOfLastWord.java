package HW2;

public class LengthOfLastWord {
    class Solution {
        public int lengthOfLastWord(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            } else {
                String lastWord = s.substring(s.lastIndexOf(" ") + 1);
                return lastWord.length();
            }
        }
    }
}
