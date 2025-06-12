class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) zero++;
            else if(nums[i] == 1) one++;
            else two++;
        }
        int idx = 0;
        while(zero != 0){
            nums[idx] = 0;
            idx++;
            zero--;
        }
        while(one != 0){
            nums[idx] = 1;
            idx++;
            one--;
        }
        while(two != 0){
            nums[idx] = 2;
            idx++;
            two--;
        }
    }
}