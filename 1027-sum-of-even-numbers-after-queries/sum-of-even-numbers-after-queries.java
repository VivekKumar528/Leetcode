class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int evenSum = 0;
        for(int ele : nums){
            if(ele % 2 == 0) evenSum += ele;
        }
        int len = queries.length;
        int[] res = new int[len];
        int idx = 0;
        for(int i=0;i<len;i++){
            int qVal = queries[i][0];
            int qIdx = queries[i][1];
            if(nums[qIdx] % 2 == 0){
                evenSum -= nums[qIdx];
            }
            nums[qIdx] += qVal;
            if(nums[qIdx] % 2 == 0) evenSum += nums[qIdx];
            res[idx++] = evenSum;
        }
        return res;
    }
}