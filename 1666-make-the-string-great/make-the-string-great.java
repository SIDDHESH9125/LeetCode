class Solution {
    public String makeGood(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() != ch && Character.toLowerCase(st.peek()) == Character.toLowerCase(ch)) {
                st.pop();
            } else {
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