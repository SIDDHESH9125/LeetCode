class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int i=-1;

        for(int j=0;j<n;j++){
            if(nums[j]==0){
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }

        int k=i+1;
        for(int j=k;j<n;j++){
            if(nums[j]==1){
                i++;
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }

       
    }
}