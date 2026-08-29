class Solution {
    public int binarySearch(int[] nums, int target){
        int len = nums.length;
        int start = 0;
        int end = len-1;
        int res = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] <= target){
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res+1;

    }
    public int[] answerQueries(int[] nums, int[] q) {
        int qLen = q.length;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        int[] res = new int[qLen];
        int idx = 0;
        for(int query : q){
            res[idx++] = binarySearch(nums, query);
        }
        return res;
    }
}