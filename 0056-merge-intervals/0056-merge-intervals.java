class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result= new ArrayList<>();
        result.add(intervals[0]);

        for(int i=1;i<intervals.length;i++){
            int[] LastInterval=result.get(result.size()-1);
            if(LastInterval[1]>=intervals[i][0] && LastInterval[1]<=intervals[i][1]){
                  LastInterval[1]= intervals[i][1];
            }
            else if(LastInterval[1]<=intervals[i][0]){
                result.add(intervals[i]);
            }
        }return result.toArray(new int[result.size()][]);
    }
}