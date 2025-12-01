class Solution {
    public int[] sumEvenAfterQueries(int[] arr, int[][] q) {
        int len = arr.length;
        int[] ans = new int[q.length];
        for(int i=0;i<q.length;i++){
            int idx = q[i][1];
            arr[idx] += q[i][0];
            int sum = 0;
            for(int j=0;j<len;j++){
                if(arr[j] % 2 == 0) sum+= arr[j];
            }
            ans[i] = sum;
        }
        return ans;
    }
}