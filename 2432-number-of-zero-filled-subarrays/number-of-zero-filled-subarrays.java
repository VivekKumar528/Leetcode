class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int len = nums.length;

        long res = 0;

        for (int i = 0; i < len; ) {
            int count = 0;
            if (nums[i] == 0) {
                while (i < len && nums[i] == 0) {
                    count++;
                    i++;
                }
            } else
                i++;
            res += (long) (count) * (count + 1) / 2;
        }
        return res;

    }
}