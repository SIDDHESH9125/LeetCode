class Solution {
    public boolean possible(int[] bloomDay,int day,int m,int k){
        int count=0;
        int bouquets=0;

        for(int bloom : bloomDay){
            if(bloom <= day){
                count++;
                if(count==k){
                    bouquets++;
                    count=0;
                }
            }else{
                count=0;
            }
        }return bouquets >= m; 
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        
        if(n<(long)m*k){
            return -1;
        }
        
         int low = Arrays.stream(bloomDay).min().getAsInt();
        int high= Arrays.stream(bloomDay).max().getAsInt();
        int result=-1;

       while(low<=high){
           int mid=(low+high)/2;
           
           if (possible(bloomDay,mid,m,k)){
               result=mid;
               high=mid-1;
           }else{
            low=mid+1;
           }
       }
       return result;
       
    }
}