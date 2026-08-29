class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Arrays.sort(nums);
        int m = queries.length;
        int[] res = new int[m];
        int i = 0;
        for(int query : queries){
            int sum = 0;

            for(int j=0;j<n;j++){
                sum += nums[j];
                if(sum > query){
                    res[i++] = j;
                    break;
                }

                if(j == n-1) res[i++] = n;
            }
        }
        return res;
    }
}