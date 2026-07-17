class Solution {
    public void swapElements(int idx1, int idx2, int[]arr){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int len = nums.length;
        while(j < len){
            if(nums[i] == nums[j]){
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        } 
        return i+1;
    }
}