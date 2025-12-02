class Solution {
    public int pivotIndex(int[] arr) {
        int len = arr.length;
        for(int i=1;i<len;i++){
            arr[i] += arr[i-1];    
        }
        int totalSum = arr[len-1];
        for(int i=0;i<len;i++){
            int leftSum = (i==0 ? 0 : arr[i-1]);
            int rightSum = totalSum - arr[i];
            if(leftSum == rightSum) return i;
        }
        return -1;

    }
}