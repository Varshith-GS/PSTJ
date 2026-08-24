public static List<Integer> maxSubarray(List<Integer> arr) {

    int maxSubarray = arr.get(0);
    int currentSum = arr.get(0);

    int maxSubsequence = arr.get(0);

    for (int i = 1; i < arr.size(); i++) {

        int value = arr.get(i);

        // Kadane's Algorithm
        currentSum = Math.max(value, currentSum + value);
        maxSubarray = Math.max(maxSubarray, currentSum);

        // Maximum subsequence
        maxSubsequence = Math.max(maxSubsequence, value);
    }

    // If there are positive numbers,
    // add all positive values for maximum subsequence
    int positiveSum = 0;

    for (int value : arr) {
        if (value > 0) {
            positiveSum += value;
        }
    }

    if (positiveSum > 0) {
        maxSubsequence = positiveSum;
    }

    return Arrays.asList(maxSubarray, maxSubsequence);
}
