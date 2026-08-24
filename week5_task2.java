class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        // Pattern must be smaller than the complete string
        for (int len = 1; len <= n / 2; len++) {

            // Pattern length must divide string length
            if (n % len != 0) {
                continue;
            }

            String pattern = s.substring(0, len);

            boolean valid = true;

            // Check every part against the pattern
            for (int i = len; i < n; i += len) {

                if (!s.substring(i, i + len).equals(pattern)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                return true;
            }
        }

        return false;
    }
}
