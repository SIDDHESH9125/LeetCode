class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
 
       
        if (k < 0 || k > n) {
            return -1;
        }
 
    
        if (k == 0) {
            return 0;
        }
 
        
        if (k == n) {
            int total = 0;
 
           
            for (int value : cardPoints) {
                total += value;
            }
 
            return total;
        }
 
        int currentScore = 0;
 
        
        for (int i = 0; i < k; i++) {
            currentScore += cardPoints[i];
        }
 
        int maxScore = currentScore;
        int rightIndex = n - 1;
 
       
        for (int leftIndex = k - 1; leftIndex >= 0; leftIndex--) {
            currentScore -= cardPoints[leftIndex];
            currentScore += cardPoints[rightIndex];
            rightIndex--;
 
           
            if (currentScore > maxScore) {
                maxScore = currentScore;
            }
        }
 
        return maxScore;
    }
}