class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int m = queries.length;
        int[] ans = new int[m];
        for(int i=0;i<m;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            int xor = 0;
            for(int j=left;j<=right;j++){
                xor ^= arr[j];
            }
            ans[i] = xor;
        }
        return ans;
    }
}