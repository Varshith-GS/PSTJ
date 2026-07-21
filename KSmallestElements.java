import java.util.Arrays;
import java.util.Scanner;

public class KSmallestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input k
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid value of k! It must be between 1 and " + n);
        } else {
            // Sort the array
            Arrays.sort(arr);

            // Print k smallest elements
            System.out.println("The " + k + " smallest elements are:");
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
