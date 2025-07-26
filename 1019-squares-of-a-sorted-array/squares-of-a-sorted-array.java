class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int idx = nums.length-1;
        int[] res = new int[nums.length];
        while(idx >= 0){
            int firstSq = nums[i]*nums[i];
            int secondSq = nums[j]*nums[j];
            if(firstSq > secondSq){
                res[idx] = firstSq;
                i++;

            } else {
                res[idx] = secondSq;
                j--;
                
            }
            idx--;
        }
        return res;
    }
}