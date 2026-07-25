import java.util.Arrays;

public class SumOddEvenLambda {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 2, 1, 6};
        int evenSum = Arrays.stream(numbers)
                            .filter(n -> n % 2 == 0)
                            .sum();

        int oddSum = Arrays.stream(numbers)
                           .filter(n -> n % 2 != 0)
                           .sum();

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
