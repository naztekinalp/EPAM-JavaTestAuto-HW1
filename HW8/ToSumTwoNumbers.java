package HW8;

public class ToSumTwoNumbers {
    @FunctionalInterface
    public interface SumFunction {
        int sum(int a, int b);
    }

    public static void main(String[] args) {
        SumFunction sumFunction = (a, b) -> a + b;
        int result = sumFunction.sum(5, 3); // result will be 8
        System.out.println(result);
    }

}
