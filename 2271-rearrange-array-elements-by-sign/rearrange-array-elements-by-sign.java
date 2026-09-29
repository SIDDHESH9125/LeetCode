class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        List<Integer> pos=new ArrayList<>();int idx1=0;
        List<Integer> neg=new ArrayList<>();int idx2=0;
        List<Integer> ans=new ArrayList<>();
        for(int num : nums){
            if(num >=0){
                pos.add(num);
            }else{
                neg.add(num);
            }
        }
        while(idx2<n/2){
            ans.add(pos.get(idx1));
            idx1++;
            ans.add(neg.get(idx2));
            idx2++;
        }
        return ans.stream().mapToInt(Integer :: intValue).toArray();
    }
}