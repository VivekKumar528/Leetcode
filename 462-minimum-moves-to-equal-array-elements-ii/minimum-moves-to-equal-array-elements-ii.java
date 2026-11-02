class Solution {
    public int minMoves2(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int midEle = nums[len/2];

        int moves = 0;
        for(int ele : nums) moves += Math.abs(ele - midEle);

        return moves;
    }
}