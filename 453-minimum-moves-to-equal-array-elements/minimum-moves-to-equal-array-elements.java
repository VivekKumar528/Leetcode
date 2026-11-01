class Solution {
    public int minMoves(int[] nums) {
        int minEle = Integer.MAX_VALUE;
        int sum = 0;
        for(int ele : nums){
            if(ele < minEle) minEle = ele;
            sum += ele;
        }
        int len = nums.length;
        return sum - (len*minEle);
    }
}