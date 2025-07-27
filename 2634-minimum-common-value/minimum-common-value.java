class Solution {
    public int binarySearch(int target, int[] arr){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return target;
            else if(target < arr[mid]) high = mid-1;
            else low = mid+1;
        }
        return Integer.MAX_VALUE;
    }
    public int getCommon(int[] nums1, int[] nums2) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums1.length;i++){
            ans =  Math.min(binarySearch(nums1[i], nums2), ans);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}