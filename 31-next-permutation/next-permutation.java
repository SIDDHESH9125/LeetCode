class Solution {
   private void swap (int[] nums, int i,int j){
         int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
   private void reverse(int[] nums ,int l,int r){
        while(l<r){
            swap(nums,l,r);
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                 pivot=i;
                 break;
            }
        }
        if(pivot!=-1){
            for(int j=nums.length-1;j>pivot;j--){
                if(nums[j]>nums[pivot]){
                    swap(nums,j,pivot);
                    break;
                }
            }
        }

        reverse(nums,pivot+1,nums.length-1);
    }
}