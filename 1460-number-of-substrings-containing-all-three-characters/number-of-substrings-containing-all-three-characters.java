class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int l=0 ; 
        int count=0;
        for(int r=0;r<n ;r++){
            map.put(s.charAt(r),map.getOrDefault(s.charAt(r),0)+1);

            while(map.getOrDefault('a', 0) > 0 &&
                   map.getOrDefault('b', 0) > 0 &&
                   map.getOrDefault('c', 0) > 0) {
                    count+=n-r;
                   

                 char ch=s.charAt(l);
                 map.put(ch,map.get(ch)-1);

                  if(map.get(ch)==0){
                  map.remove(ch);
                    }
                    l++;
                 }
        }return count;
        }
}