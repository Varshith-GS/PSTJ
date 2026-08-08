import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int choice = sc.nextInt();
            int num = sc.nextInt();

            switch (choice) {
                case 1:
                    if (num % 2 == 0)
                        System.out.println("EVEN");
                    else
                        System.out.println("ODD");
                    break;

                case 2:
                    if (isPrime(num))
                        System.out.println("PRIME");
                    else
                        System.out.println("COMPOSITE");
                    break;

                case 3:
                    if (isPalindrome(num))
                        System.out.println("PALINDROME");
                    else
                        System.out.println("NOT PALINDROME");
                    break;
            }
        }

        sc.close();
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        return original == reverse;
    }
}
