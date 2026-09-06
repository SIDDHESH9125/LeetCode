class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n= nums.length /3;
        List<Integer> m= new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])>n){
                if(!m.contains(nums[i])){
                  m.add(nums[i]);
                }
            }
        }return m;
    }
}