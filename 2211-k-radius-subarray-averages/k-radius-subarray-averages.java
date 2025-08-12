class Solution {
    public int[] getAverages(int[] arr, int k) {
        int len = arr.length;

        if (k == 0)
            return arr;

        int[] result = new int[len];
        Arrays.fill(result, -1);

        if (len < 2 * k + 1)
            return result;

        long window = 0;

        int left = 0;
        int right = 2 * k;
        int i = k;

        for (int x = left; x <= right; x++) {
            window += arr[x];
        }
        int elementInWindow = 2 * k + 1;
        result[i] = (int) (window / elementInWindow);
        i++;
        right++;

        while (right < len) {
            int elementDeleted = arr[left];
            int elementAdded = arr[right];

            window = window + elementAdded - elementDeleted;
            result[i] = (int) (window / elementInWindow);
            i++;
            right++;
            left++;
        }
        return result;

    }
}