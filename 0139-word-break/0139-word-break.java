import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);

        int n = s.length();

        // dp[i] means:
        // s.substring(0, i) can be formed using wordDict
        boolean[] dp = new boolean[n + 1];

        // Empty string can always be formed
        dp[0] = true;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] && set.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}