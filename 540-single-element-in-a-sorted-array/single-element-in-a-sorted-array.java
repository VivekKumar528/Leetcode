class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xor = 0;
        int len = nums.length;

        for(int ele : nums) xor ^= ele;

        return xor;
    }
}