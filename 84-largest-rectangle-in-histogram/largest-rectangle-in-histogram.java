class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> st=new ArrayDeque<>();
        int MaxArea=0 ;
        int n=heights.length;

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                int min_height=st.pop();
                int height=heights[min_height];
                int left_boundary=st.isEmpty() ? -1 : st.peek();
                int width=i-left_boundary-1;
                int area=height*width;

                MaxArea=Math.max(MaxArea,area);
            }
            st.push(i);
        }
        while(!st.isEmpty() ){
                int min_height=st.pop();
                int height=heights[min_height];
                int left_boundary=st.isEmpty() ? -1 : st.peek();
                int width=n-left_boundary-1;
                int area=height*width;

                MaxArea=Math.max(MaxArea,area);
            }

            return MaxArea;
    }
}