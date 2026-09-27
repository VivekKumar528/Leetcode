class Solution {
    public List<Integer> getNSL(int[] arr, int len) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < len; i++) {
            if (st.isEmpty())
                result.add(-1);
            else {
                while (!st.isEmpty() && arr[st.peek()] > arr[i])
                    st.pop();

                if (st.isEmpty())
                    result.add(-1);
                else
                    result.add(st.peek());
            }
            st.push(i);
        }

        return result;

    }

    public List<Integer> getNSR(int[] arr, int len) {
        List<Integer> result = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = len - 1; i >= 0; i--) {
            if (st.isEmpty())
                result.add(len);
            else {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                    st.pop();

                if (st.isEmpty())
                    result.add(len);
                else
                    result.add(st.peek());
            }
            st.push(i);
        }
        Collections.reverse(result);   // important
        return result;

    }

    public int sumSubarrayMins(int[] arr) {
        int len = arr.length;
        List<Integer> NSL = getNSL(arr, len);
        List<Integer> NSR = getNSR(arr, len);

        long sum = 0;
        int MOD = 1000000007;

        for (int i = 0; i < len; i++) {
            long ls = i - NSL.get(i);
            long rs = NSR.get(i) - i;

            long totalWays = ls * rs;
            long totalSum = arr[i] * totalWays;

            sum = (sum + totalSum) % MOD;
        }

        return (int) sum;
    }
}