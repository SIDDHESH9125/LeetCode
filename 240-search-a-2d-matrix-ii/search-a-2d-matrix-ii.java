class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int m=matrix.length;
        int n=matrix[0].length;

        int row=0;
        int column =n-1;

        while(row<m && column>=0){
            int curr=matrix[row][column];

            if(curr==target){
                return true;
            }else if(curr>target){
                column--;
            }else{
                row++;
            }
        }return false;
    }
}