class Solution {
    public int findIntegers(int n) {

        // dp[i] = number of binary strings of length i
        // that do not contain consecutive 1s
        int[] dp = new int[31];

        dp[0] = 1;
        dp[1] = 2;

        // Fibonacci pattern
        for (int i = 2; i < 31; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        int ans = 0;
        int prevBit = 0;

        // Check bits from left to right
        for (int i = 30; i >= 0; i--) {

            if ((n & (1 << i)) != 0) {

                // If current bit of n is 1,
                // we can put 0 here and count valid numbers
                ans += dp[i];

                // If previous bit was also 1,
                // n contains consecutive ones
                if (prevBit == 1) {
                    return ans;
                }

                prevBit = 1;

            } else {
                prevBit = 0;
            }
        }

        // Include n itself
        return ans + 1;
    }
}