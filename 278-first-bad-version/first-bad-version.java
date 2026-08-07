/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low=1 ; int high =n;
        int ver=n;
        int version =ver;
        while (low<=high){
            int mid=low+(high-low) / 2;

            if(isBadVersion(mid)==true){
                 version=mid;
                 high=mid-1;
            }else{
                low=mid+1;
            }
        ver=Math.min(ver,version);
        }return ver;
    }
}