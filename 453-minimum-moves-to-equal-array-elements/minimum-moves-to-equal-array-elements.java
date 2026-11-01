class Solution {
    public int minMoves(int[] nums) {
        int minEle = Integer.MAX_VALUE;
        for(int ele : nums) if(ele < minEle) minEle = ele;
        int moves = 0;
        for(int ele : nums) moves += ele - minEle;
        return moves;
    }
}