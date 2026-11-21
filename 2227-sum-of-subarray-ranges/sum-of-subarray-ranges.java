class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;long min_sum=0;
        Deque<Integer> st=new ArrayDeque<>();

        for(int i=0;i<=n;i++){
            while(!st.isEmpty() &&(i==n ||nums[st.peek()]>= nums[i])){
                int mid=st.pop();
                int left=st.isEmpty() ? -1:st.peek();
                int right=i;
                long min_contri=(long)nums[mid]*(mid-left)*(right-mid);
                min_sum += min_contri;
            }
            if(i<n){
                st.push(i);
            }
        }
        long max_sum=0;
        for(int i=0;i<=n;i++){
            while(!st.isEmpty() &&(i==n ||nums[st.peek()]<= nums[i])){
                int mid=st.pop();
                int left=st.isEmpty() ? -1:st.peek();
                int right=i;
                long max_contri=(long)nums[mid]*(mid-left)*(right-mid);
                max_sum += max_contri;
            }
            if(i<n){
                st.push(i);
            }
        }
        return max_sum-min_sum;
    }
}