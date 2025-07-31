class Solution {
    public boolean binarySearch(int target, int[] arr){
        int lo = 0;
        int high = arr.length-1;
        while(lo <= high){
            int mid = lo + (high-lo)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) lo = mid+1;
            else high = mid-1;
        }
        return false;
    }
    public int[] intersection(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr1);
        for(int i=0;i<len2;i++){
            if(binarySearch(arr2[i], arr1)) set.add(arr2[i]);
        }
        int[] ans = new int[set.size()];
        int idx = 0;
        for(int ele : set) ans[idx++] = ele;
        return ans;
    }
}