class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length +nums2.length;
        int l=0;int r=0;
        double prev=0;double curr=0;
        int count=0;
        while(count <= n/2){
            prev=curr;
            if(l < nums1.length && (r >= nums2.length || nums1[l]<nums2[r])){
                curr=nums1[l++];
                
            }else {
                curr=nums2[r++];
               
            }
            count ++;
        }
        
        if(n%2!=0){
            return curr;
        }else{
            return (prev+curr)/2.0;
        }
     
    }
}