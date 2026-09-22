class Solution {
    public int findPivot(int[] arr){
        int l = 0;
        int r = arr.length-1;

        while(l < r && arr[l] == arr[l+1]) l++;
        while(l < r && arr[r] == arr[r-1]) r--;
        while(l < r){
            int mid = l + (r-l)/2;
            if(arr[mid] > arr[r]) l = mid+1;
            else r = mid;
        }
        return r;
    }
    public boolean binarySearch(int[] arr, int l, int r, int target){
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid] > target) r = mid-1;
            else l = mid+1;
        }
        return false;
    }
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        int pivotIdx = findPivot(nums);
        if(binarySearch(nums, 0, pivotIdx-1, target)) return true;

        return binarySearch(nums, pivotIdx, len-1, target); 
    }
}