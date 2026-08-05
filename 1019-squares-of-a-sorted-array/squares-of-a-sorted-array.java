class Solution {
    public int[] sortedSquares(int[] nums) {
       int l=0;
      
       while(l<nums.length){
        nums[l]*=nums[l];
       
        l++;
       
       }
    Arrays.sort(nums);
    return nums;

    }
}