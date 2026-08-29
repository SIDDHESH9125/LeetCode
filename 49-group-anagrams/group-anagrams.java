class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0; i<strs.length;i++){
            String s=strs[i];
            char[] chars=strs[i].toCharArray();
            Arrays.sort(chars);
            String sort=new String(chars);

            if(!map.containsKey(sort)){
                map.put(sort,new ArrayList<>());
            }map.get(sort).add(s);

        }

        for(List<String> d:map.values()){
            res.add(d);
        }

        return res;
    }
}