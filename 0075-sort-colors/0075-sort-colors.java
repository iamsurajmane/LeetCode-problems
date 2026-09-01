class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                swap(nums,left,i);
                left++;
            }
        }

        for(int i=left;i<nums.length;i++){
            if(nums[i] == 1){
                swap(nums,left,i);
                left++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}