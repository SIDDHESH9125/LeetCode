class Solution {
    public int[] sortedSquares(int[] nums) {
       int l=0;
      int r=nums.length-1;
      int[] arr= new int[nums.length];
      for(int i=nums.length-1;i>=0;i--){
         int sq_l= nums[l]*nums[l];
         int sq_r=nums[r]*nums[r];
        if(sq_l<sq_r){
           
            arr[i]=sq_r;
              r--;
        }
        else{
            arr[i]=sq_l;
            l++;
        }
      }
       return arr;

    }
}