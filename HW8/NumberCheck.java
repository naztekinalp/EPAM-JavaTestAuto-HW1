package HW8;

public class NumberCheck {

    @FunctionalInterface
    interface NumberValidator {
        boolean validate(int number);
    }

    public static void main(String[] args) {

        NumberValidator validator = (number) -> number % 31 == 0;

        System.out.println(validator.validate(31)); // true
        System.out.println(validator.validate(62)); // true
        System.out.println(validator.validate(100)); // false

    }
}
