class Solution {
    public long maxAlternatingSum(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) arr[i] *= arr[i];
        
        Arrays.sort(arr);

        long maxSum = 0;
        long minSum = 0;

        for(int i=(n/2);i<n;i++) maxSum += arr[i];
        for(int i=0;i<(n/2);i++) minSum += arr[i];

        return maxSum - minSum;

    }
}