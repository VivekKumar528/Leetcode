class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int closestSum = 100000;
        for(int x=0;x<=len-1;x++){
            int i = x+1;
            int j = len-1;
            while(i < j){
                int sum = nums[x] + nums[i] + nums[j];
                if(Math.abs(target - sum) < Math.abs(target - closestSum)) closestSum = sum;
                if(sum < target) i++;
                else j--;
            }
        }
        return closestSum;
    }
}