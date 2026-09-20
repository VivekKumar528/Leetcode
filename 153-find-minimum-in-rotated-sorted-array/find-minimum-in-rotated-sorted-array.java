class Solution {
    public int findMin(int[] arr) {
        int len = arr.length;

        int l = 0;
        int r = len-1;

        while(l < r){
            int mid = l + (r-l)/2;

            if(arr[mid] > arr[r]) l = mid + 1;
            else r = mid;
        }
        return arr[r];
    }
}