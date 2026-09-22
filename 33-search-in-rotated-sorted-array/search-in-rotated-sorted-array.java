class Solution {
    public int findPivot(int[] arr){
        int l = 0;
        int r = arr.length-1;

        while(l < r){
            int mid = l + (r-l)/2;
            if(arr[mid] > arr[r]) l = mid+1;
            else r = mid;
        }
        return r;
    }
    public int binarySearch(int[] arr, int l, int r, int target){
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] < target) l = mid+1;
            else if(arr[mid] > target) r = mid-1;
            else return mid;
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int len = nums.length;

        int pivotIdx = findPivot(nums);

        int idx = binarySearch(nums, 0, pivotIdx-1, target);
        if(idx != -1) return idx;

        idx = binarySearch(nums, pivotIdx, len-1, target);

        return idx;

    }
}