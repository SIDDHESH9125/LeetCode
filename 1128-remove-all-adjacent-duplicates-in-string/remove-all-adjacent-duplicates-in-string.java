class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st=new ArrayDeque<>();
        
        for(char ch : s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            char top=st.peek();
            if(ch==top){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
       return sb.reverse().toString();

    }
}