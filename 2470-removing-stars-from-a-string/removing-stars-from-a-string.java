class Solution {
    public String removeStars(String s) {
        Deque<Character> st=new ArrayDeque<>();

        for(char ch : s.toCharArray()){
            if(ch =='*'){
                st.pop();
            }else{
                st.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}