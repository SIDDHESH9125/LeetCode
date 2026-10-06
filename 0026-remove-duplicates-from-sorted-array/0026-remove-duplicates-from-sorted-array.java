class Solution {
    public int removeDuplicates(int[] nums) {
     int l=0;
     
     for(int r=1;r<nums.length;r++){
        if(nums[r]!= nums[l]){
            l++;
            nums[l]=nums[r];
        }else{
            continue;
        }
     }return l+1;
    }
}