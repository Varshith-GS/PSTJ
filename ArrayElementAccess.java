import java.util.Scanner;

public class ArrayElementAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example array
        int[] numbers = {10, 20, 30, 40, 50};

        // Ask user for index
        System.out.print("Enter the index (0 to " + (numbers.length - 1) + "): ");
        int index = sc.nextInt();

        // Check if index is valid
        if (index >= 0 && index < numbers.length) {
            System.out.println("Element at index " + index + " is: " + numbers[index]);
        } else {
            System.out.println("Invalid index! Please enter a value between 0 and " + (numbers.length - 1));
        }
    }
}
