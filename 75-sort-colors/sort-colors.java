class Solution {
    public void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int k = n-1;

        while(j <= k){
            if(nums[j] == 1) j++;
            else if(nums[j] == 2){
                swap(j, k, nums);
                k--;
            } else {
                swap(i, j, nums);
                i++;
                j++;
            }
        }
    }
}