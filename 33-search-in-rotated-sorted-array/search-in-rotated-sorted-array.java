class Solution {
    public int binarySearch(int left, int right, int[] arr, int target){
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target ) return mid;
            if(target > arr[mid]) left = mid+1;
            else right = mid-1;
        }
        return -1;
    }
    public int search(int[] arr, int target) {
        int len = arr.length;
        if(len <= 10){
            for(int x=0;x<len;x++){
                if(arr[x] == target) return x;
            }
        }
        int pivot = -1;
        for(int x=1;x<len-1;x++){
            if(arr[x-1] < arr[x] && arr[x] > arr[x+1]) {
                pivot = x;
                break;
            }
        }
        int ans1 = binarySearch(0, pivot, arr, target);
        int ans2 = binarySearch(pivot+1, len-1, arr, target);
        if(ans1 != -1) return ans1;
        if(ans2 != -1) return ans2;
        return -1;
    }
}