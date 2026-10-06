class Solution {
    public int maxProduct(int[] nums) {
        int max_prod=nums[0];
        int min_prod=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int curr=nums[i];

            if(curr<0){
                int temp=min_prod;
                min_prod=max_prod;
                max_prod=temp;
            }

            max_prod=Math.max(curr,max_prod*curr);
            min_prod=Math.min(curr,min_prod * curr);

            ans=Math.max(ans,max_prod);
        }

        return ans;
    }
}