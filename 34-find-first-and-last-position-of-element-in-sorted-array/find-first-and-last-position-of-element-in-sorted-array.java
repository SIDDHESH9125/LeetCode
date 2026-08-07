class Solution {
    public int[] searchRange(int[] nums, int target) {
       int low = 0, high = nums.length - 1;
        int left = -1; 

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                left = mid;      
                high = mid - 1;    
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        int lr=0 ; int hg =nums.length-1;
        int right = -1;
         while (lr <= hg) {
            int m = lr + (hg - lr) / 2;

            if (nums[m] == target) {
                right = m;      
                lr = m + 1;    
            } else if (nums[m] < target) {
                lr = m + 1;
            } else {
                hg = m - 1;
            }
        }

        if(left>=0 && right>=0){
            return new int[]{left,right};
        }else{
        return new int[]{-1,-1}; }
    }
}