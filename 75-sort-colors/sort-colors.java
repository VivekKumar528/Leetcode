class Solution {
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int len = nums.length;
        int i = 0;
        int j = 0;
        int k = len-1;
        while(j <= k){
            if(nums[j] == 2){
                swap(j, k, nums);
                k--;
            } else if(nums[j] == 0){
                swap(j, i, nums);
                i++;
                j++;
            } else if(nums[j] == 1) {
                j++;
            }
        }
    }
}