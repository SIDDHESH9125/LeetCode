class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> answer= new ArrayList<>();

        for(int rows=0;rows<=33 ; rows++){
            List<Integer> current = new ArrayList<>();

            for(int col=0 ; col <=rows ;col++){
                current.add(1);
            }

            for(int col =1;col<rows;col++){
                int value =answer.get(rows-1).get(col-1)+ answer.get(rows-1).get(col);
                current.set(col,value);
            }

            answer.add(current);
        }
        return answer.get(rowIndex);
    }
}