package HW2;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" fly me to the moon "));
    }

    public static int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }

        String trimmedString = s.trim();

        if (trimmedString.length() == 0) {
            return 0;
        } else {
            String lastWord = trimmedString.substring(trimmedString.lastIndexOf(" ") + 1);
            return lastWord.length();
        }
    }
}
