class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n=nums.length;
       int cnt1=0 , cnt2=0;
       int el1=Integer.MIN_VALUE , el2=Integer.MIN_VALUE;

       for(int i=0;i<n;i++){
        if(cnt1==0 && nums[i]!=el2){
            cnt1++;
            el1=nums[i];
        }else if(cnt2==0 && nums[i]!=el1){
            cnt2++;
            el2=nums[i];
        }else if(nums[i]==el1){
            cnt1++;
        }else if(nums[i]==el2){
            cnt2++;
        }else{
            cnt1--;
            cnt2--;
        }
       }
        cnt1=0;cnt2=0;

        for(int j=0;j<n;j++){
            if(nums[j]==el1) cnt1++;
            if(nums[j]==el2)cnt2++;
        }

        int m=n/3+1;
        ArrayList<Integer> res= new ArrayList<>();
        if(cnt1>=m) res.add(el1);
        if(cnt2>=m && el2!=el1) res.add(el2);
       
       return res;
    }
}