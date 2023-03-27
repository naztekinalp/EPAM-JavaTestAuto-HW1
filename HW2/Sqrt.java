package HW2;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println(SquareRoot(81));
    }

    public static int SquareRoot(int a) {
        if (a < 2) {
            return a;
        }

        int b = 1;
        while (b * b <= a) {
            b++;
        }
        return b - 1;
    }
}
