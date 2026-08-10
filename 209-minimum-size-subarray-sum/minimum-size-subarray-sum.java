class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0 ;
        int sum =0;int n= nums.length;
        int ans =n+1;
        for(int r=0 ; r<nums.length;r++){
            sum += nums[r];
            while(sum>=target){
            ans=Math.min(ans,r-left+1);
            sum-=nums[left];
            left++;
            }
        }

        return (ans== n+1)? 0: ans;
    }
}