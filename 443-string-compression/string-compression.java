class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;
        for (int r = 0; r < chars.length; r++) {
            int count = 0;
            char ch = chars[r];
            while (r < n && chars[r] == ch) {
                count++;
                r++;
            }
            if (count == 1) {
                chars[idx] = ch;
                idx++;
            } else {
                chars[idx] = ch;
                idx++;
                String s =Integer.toString(count);
                for (char dig : s.toCharArray()) {
                    chars[idx] = dig;
                    idx++;
                }

               
              
            }
        r--;
        }
        return idx;
    }
}