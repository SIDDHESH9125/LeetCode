class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] pse = new int[n];
        int[] nse = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        long sum = 0;
        int MOD = 1_000_000_007;
        for (int i = 0; i < n; i++) {
            long left_count = i - pse[i];
            long right_count = nse[i] - i;
            long cont = (long)arr[i] * left_count * right_count;
            sum=(sum + cont ) % MOD;
        }

        return (int)sum;
    }
}