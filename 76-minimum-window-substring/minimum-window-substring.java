class Solution {
    public String minWindow(String s, String t) {
       int n= s.length();
       int m=t.length();

       if(n==0 || m==0 || n<m){
        return "";
       }

       int[] need =new int[128];
       int[] window=new int[128];
       for(int i=0;i<m;i++){
        need[t.charAt(i)]++;
       }

       int l=0 ,matched=0 ;
       int minLength=Integer.MAX_VALUE;
       int startIndex=-1;

       for(int r=0;r<n;r++){
        char curr=s.charAt(r);
        window[curr]++;

        if(need[curr]>0 && window[curr]<= need[curr]){
            matched++;
        }

        while(matched == m){
            int currLength =r-l+1;

            if(currLength < minLength){
                minLength=currLength;
                startIndex=l;
            }

            char left=s.charAt(l);
            window[left]--;

            if(need[left]>0 && window[left]<need[left]){
                matched--;
            } 
            l++;
        }

       }

       if(startIndex == -1){
        return "";
       }else{
        return s.substring(startIndex,startIndex+minLength);
       }

    }
}