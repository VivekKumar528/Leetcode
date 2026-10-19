class Solution {
    public int minKadaneAlgo(int[] arr){
        int len = arr.length;

        int sum = arr[0];
        int minSum = arr[0];

        for(int i=1;i<len;i++){
            sum = Math.min(sum + arr[i], arr[i]);
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }

    public int maxKadaneAlgo(int[] arr){
        int len = arr.length;
        int sum = arr[0];
        int maxSum = arr[0];

        for(int i=1;i<len;i++){
            sum = Math.max(sum + arr[i], arr[i]);
            maxSum = Math.max(sum, maxSum);
        }

        return maxSum;

    }
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        for(int ele : nums) totalSum += ele;
        int minSubarraySum = minKadaneAlgo(nums);
        int circularSum = totalSum - minSubarraySum;
        int maxSubarraySum = maxKadaneAlgo(nums);
        if(maxSubarraySum > 0) return Math.max(maxSubarraySum, circularSum);

        return maxSubarraySum;
    }
}