class Solution {
    public int minimumPairRemoval(int[] nums) {

        int operations = 0;

        while (!isSorted(nums)) {

            int minSum = Integer.MAX_VALUE;
            int index = 0;

            // Find adjacent pair with minimum sum
            for (int i = 0; i < nums.length - 1; i++) {

                int sum = nums[i] + nums[i + 1];

                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            // Create new array after removing the pair
            int[] newNums = new int[nums.length - 1];

            int j = 0;

            for (int i = 0; i < nums.length; i++) {

                if (i == index) {
                    newNums[j++] = nums[i] + nums[i + 1];
                    i++; // Skip the second element of the pair
                } else {
                    newNums[j++] = nums[i];
                }
            }

            nums = newNums;
            operations++;
        }

        return operations;
    }

    // Check whether array is non-decreasing
    private boolean isSorted(int[] nums) {

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }

        return true;
    }
}