class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length-1;
        int res = 0;
        int mod = 1_000_000_007;
        int[] temp = new int[nums.length];
        temp[0] = 1;
        for(int i=1;i<nums.length;i++){
            temp[i] = (temp[i-1] * 2) % mod;
        }
        while(l <= r){
            if(nums[l] + nums[r] <= target){
                int diff = r - l;
                res = (res % mod + temp[diff]) % mod;
                l++;

            } else r--;
        }
        return res;
        
    }
}