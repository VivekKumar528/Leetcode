class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length;

        int l = 0;
        int r = len-1;
        int mid = -1;
        while(l <= r){
            mid = l + (r-l)/2;
            int missingNumbersTillMid = arr[mid] - (mid+1);

            if(missingNumbersTillMid < k) l = mid+1;
            else r = mid - 1;
        }
        return l + k;
    }
}