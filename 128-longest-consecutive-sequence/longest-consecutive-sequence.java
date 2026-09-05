class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int count=0;
        int longest=1;

        int lastSmall=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 ==lastSmall){
                count++;
                lastSmall=nums[i];
            }

            if(nums[i]!=lastSmall){
                count=1;
                lastSmall=nums[i];
            }


           longest=Math.max(longest,count); 
        }
        return longest;
    }
}