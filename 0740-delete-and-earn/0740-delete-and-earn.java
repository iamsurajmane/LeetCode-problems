class Solution {
    public int deleteAndEarn(int[] nums) {
      int frq[] = new int[10002];
      int dp[] = new int[10002];

      for(int i=0;i<nums.length;i++){
        frq[nums[i]]++;
      }

      dp[0] = 0;
      dp[1] = 1 * frq[1];
      for(int i=2;i<10002;i++){
        dp[i] = Math.max(dp[i-1] , dp[i-2] + i*frq[i]);
      }

      return dp[10001];
    }
}