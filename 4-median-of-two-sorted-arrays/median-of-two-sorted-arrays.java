class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int total=n1+n2;

        int l=0, r=0;
        int count =0;
        double prev=0,curr=0;

        while(count<=total/2){
            prev=curr;
            if(l<n1 &&(r>=n2 || nums1[l]< nums2[r])){
                curr=nums1[l];
                l++;

            }else{
                curr=nums2[r];
                r++;
            }
            count++;
        }
        if(total % 2==0){
            return (prev+curr)/2.0;
        }else{
            return curr;
        }
    }
}