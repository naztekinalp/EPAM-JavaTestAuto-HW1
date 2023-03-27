package HW2;

public class LengthOfLastWord {
    public static void main(String[] args) {
        lengthOfLastWord("hello test word");
    }
        public static int lengthOfLastWord(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            } else {
                String lastWord = s.substring(s.lastIndexOf(" ") + 1);
                return lastWord.length();
            }

    }
}
