class Solution {
    public int atMost(int[] nums , int k){
        int l=0;
        int odd_count=0, max_count=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r] % 2 != 0){
                odd_count++;
            }
            while(odd_count > k ){
                if(nums[l] % 2 != 0){
                    odd_count--;
                }l++;
            }
            max_count+=r-l+1;
        }return max_count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k) - atMost(nums,k-1);
    }
}