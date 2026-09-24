class Solution {
    public int thirdMax(int[] nums) {
        long largest = Long.MIN_VALUE;
        long secondLargest = Long.MIN_VALUE;
        long thirdLargest = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == largest || nums[i] == secondLargest || nums[i] == thirdLargest) {
                continue;
            }
            if(nums[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] > secondLargest){
                thirdLargest = secondLargest;
                secondLargest = nums[i];
            }
            else if(nums[i] > thirdLargest){
                thirdLargest = nums[i];
            }
        }
        if(thirdLargest == Long.MIN_VALUE){
            return (int) largest;
        }
        return (int) thirdLargest;
    }
}