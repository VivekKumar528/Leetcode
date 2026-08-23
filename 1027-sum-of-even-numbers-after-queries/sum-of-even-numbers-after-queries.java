class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int len = queries.length;
        int idx = 0;
        int[] res = new int[len];
        for(int i=0;i<len;i++){
            int qVal = queries[i][0];
            int qIdx = queries[i][1];
            nums[qIdx] += qVal;
            int evenSum = 0;
            for(int ele : nums){
                if(ele % 2 == 0) evenSum += ele;
            }
            res[idx++] = evenSum;
        }
        return res;
    }
}