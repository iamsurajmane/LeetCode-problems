import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        // Store frequency, first index and last index
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            // First occurrence
            if (!first.containsKey(num)) {
                first.put(num, i);
            }

            // Frequency
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            // Last occurrence
            last.put(num, i);
        }

        // Find degree of array
        int degree = 0;

        for (int count : freq.values()) {
            degree = Math.max(degree, count);
        }

        // Find minimum subarray length
        int answer = nums.length;

        for (int num : freq.keySet()) {

            if (freq.get(num) == degree) {

                int length = last.get(num) - first.get(num) + 1;

                answer = Math.min(answer, length);
            }
        }

        return answer;
    }
}