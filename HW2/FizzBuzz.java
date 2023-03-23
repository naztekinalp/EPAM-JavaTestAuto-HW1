package HW2;

public class FizzBuzz {
    public static void fizzBuzz2(int number) {
        if (number % 15 == 0) {
            System.out.println("fizz-buzz");
        } else if (number % 5 == 0) {
            System.out.println("buzz");
        } else if (number % 3 == 0) {
            System.out.println("fizz");
        }
    }
}
