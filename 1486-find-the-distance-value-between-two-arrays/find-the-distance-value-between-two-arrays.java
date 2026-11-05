class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int len1 = arr1.length;
        int len2 = arr2.length;

        int count = 0;

        for (int i = 0; i < len1; i++) {
            boolean allValid = true;
            for (int j = 0; j < len2; j++) {
                int sub = Math.abs(arr1[i] - arr2[j]);
                if (sub <= d) {
                    allValid = false;
                    break;
                }
            }
            if (allValid)
                count++;
        }

        return count;
    }
}