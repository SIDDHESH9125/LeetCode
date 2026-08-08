class Solution {
    public String reverseWords(String s) {
        String[] n=s.trim().split("\\s+");

        String s1="";
        for(int i=n.length-1;i>=0;i--){
            s1=s1+n[i];

            if(i!=0){
                s1=s1+" ";
            }
        }return s1;
    }
}