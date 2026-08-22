import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // handle cases where k > n

        // Reverse entire array
        reverse(nums, 0, n - 1);
        // Reverse first k elements
        reverse(nums, 0, k - 1);
        // Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Quick test
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1,2,3,4,5,6,7};
        sol.rotate(nums1, 3);
        System.out.println(Arrays.toString(nums1)); // [5,6,7,1,2,3,4]

        int[] nums2 = {-1,-100,3,99};
        sol.rotate(nums2, 2);
        System.out.println(Arrays.toString(nums2)); // [3,99,-1,-100]
    }
}
