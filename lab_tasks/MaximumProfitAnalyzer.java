import java.util.*;

public class MaximumProfitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] profits = new int[N];
        for (int i = 0; i < N; i++) {
            profits[i] = sc.nextInt();
        }
        int maxSoFar = profits[0];
        int currentMax = profits[0];
        for (int i = 1; i < N; i++) {
            currentMax = Math.max(profits[i], currentMax + profits[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        System.out.println(maxSoFar);
    }
}
