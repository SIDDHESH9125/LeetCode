class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int low=0;
        int high=row-1;

        while(low<high){
            int mid=low+(high-low)/2;

            int bestcol=0;
            for(int i=0;i<col;i++){
                if(mat[mid][i] > mat[mid][bestcol]){
                    bestcol=i;
                }
            }

            if(mat[mid][bestcol]>mat[mid+1][bestcol]){
                high=mid;
            }else{
                low=mid+1;
            }
        }

        int best=0;
        for(int i=0;i<col;i++){
           if(mat[low][i]>mat[low][best]){
            best=i;
           }
        }

        return new int[]{low,best};
    }
}