package HW2;

public class Sqrt {
    public static void main(String[] args) {
        mySqrt(4);
    }

    public static int mySqrt(int x) {
        int result = 0;
        if (x == 0) {
            return 0;
        } else {
            result = (int) Math.sqrt(x);
        }
        return result;
    }
}
