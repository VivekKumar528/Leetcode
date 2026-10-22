class Solution {
    public int minOperations(int[] nums) {
        int len = nums.length;

        int asc_count = 0;
        int dec_count = 0;

        for (int i = 1; i < len; i++) {
            if (nums[i] == (nums[i - 1] + 1) % len) {
                asc_count++;
            }
            if (nums[i - 1] == (nums[i] + 1) % len) {
                dec_count++;
            }
        }

        if (asc_count == len - 1 && nums[0] == 0) {
            return 0;
        }

        if (asc_count == len - 1) {
            int leftRot = len - nums[0];
            int rightRot = 1 + (nums[len - 1] + 1) + 1;
            return Math.min(leftRot, rightRot);
        }

        if (dec_count == len - 1) {
            int leftRot = len - nums[len - 1] + 1;
            int rightRot = (nums[0] + 1) % len + 1;

            return Math.min(leftRot, rightRot);
        }

        return -1;
    }
}