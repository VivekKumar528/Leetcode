class Solution {

    public int leftBinarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        int leftMostIdx = -1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                leftMostIdx = mid;
                r = mid - 1;
            } else if(arr[mid] > target) r = mid-1;
            else l = mid + 1;
        }
        return leftMostIdx;
    }

    public int rightBinarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;
        int rightMostIdx = -1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target){
                rightMostIdx = mid;
                l = mid+1;
            } else if(arr[mid] > target) r = mid-1;
            else l = mid+1;
        }
        return rightMostIdx;
    }
    public int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = leftBinarySearch(arr, target);
        ans[1] = rightBinarySearch(arr, target);

        return ans;
    }
}