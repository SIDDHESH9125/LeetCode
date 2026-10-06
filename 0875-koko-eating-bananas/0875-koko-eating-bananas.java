class Solution {
    public long calcHours(int[] a, int speed) {
       long totalHours = 0;
        for (int pile : a) {
            totalHours += (long) Math.ceil((double) pile / speed);
        }
        return totalHours;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = Arrays.stream(piles).max().getAsInt();

        int low = 1;
        int high = maxPile;
        int ans = maxPile;

        while (low <= high) {
            int mid = low+(high-low)/ 2;
            long totalH = calcHours(piles, mid);

            if (totalH <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}