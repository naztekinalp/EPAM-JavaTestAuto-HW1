package HW2;

public class Fibonacci {
    public static void main(String args[]) {
        int n = 100;
        fibo(n);
    }

    static void fibo(int n) {
        int number1 = 0;
        int number2 = 1;
        int count = 0;

        while (count < n) {
            System.out.println(number1 + " ");
            int number3 = number2 + number1;
            number1 = number2;
            number2 = number3;
            count = count++;
        }
    }
}