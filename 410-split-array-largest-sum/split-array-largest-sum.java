class Solution {
    int possible(int[] nums, int maxSum) {
        int count = 1;
        int sum = 0;

        for (int n : nums) {
            if (sum + n > maxSum) {
                count++;
                sum = 0;
            }
            sum += n;
        }
        return count;
    }

    public int splitArray(int[] nums, int k) {
        int totalSum = 0;
        for (int a : nums) {
            totalSum += a;
        }

        int low = Arrays.stream(nums).max().getAsInt();
        int high = totalSum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(nums, mid) <= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}