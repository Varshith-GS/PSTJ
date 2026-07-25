import java.util.function.BiFunction;

public class SumLastDigit {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 567;

        BiFunction<Integer, Integer, Integer> sumLastDigits = SumLastDigit::addLastDigits;

        int result = sumLastDigits.apply(num1, num2);

        System.out.println("Sum of last digits: " + result);
    }

    public static int addLastDigits(int a, int b) {
        int lastDigitA = a % 10;
        int lastDigitB = b % 10;
        return lastDigitA + lastDigitB;
    }
}
