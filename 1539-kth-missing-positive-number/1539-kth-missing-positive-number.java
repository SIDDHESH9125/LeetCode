class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length;

        while(low< high){
            int mid=low+(high-low)/2;

            int missingno=(arr[mid]-1)-mid;

            if(missingno<k){
                low=mid+1;
            }else{
                high=mid;
            }
        }return high+k;
    }
}