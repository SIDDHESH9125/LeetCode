class Solution {
    public int maxSubArray(int[] nums) {
        int count=nums[0];int max=count;
        for(int i=1;i<nums.length;i++){
            count=Math.max(nums[i],count+nums[i]);
            max=Math.max(max,count);
        }
        return max;
    }
}