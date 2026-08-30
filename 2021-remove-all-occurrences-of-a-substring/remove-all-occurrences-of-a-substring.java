class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder stack =new StringBuilder();
        int l=part.length();

        for(char ch : s.toCharArray()){
            stack.append(ch);
            
            if(stack.length()>=l && stack.substring(stack.length()-l).equals(part)){
                stack.delete(stack.length()-l,stack.length());
            }
        }

        return stack.toString();
    }
}