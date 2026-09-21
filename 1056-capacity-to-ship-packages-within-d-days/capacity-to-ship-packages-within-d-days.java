class Solution {
    int possible(int[] weights, int capacity) {
        int count = 1;
        int weight = 0;
        for (int w : weights) {
            if (weight + w > capacity) {
                count++;
                weight = 0;
            }
            weight += w;
        }
        return count;
    }

    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        for (int s : weights) {
            sum += s;
        }

        int low = Arrays.stream(weights).max().getAsInt();
        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((possible(weights, mid) <= days)) {

                high = mid - 1;

            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}