class Solution {
    List<List<Integer>> ans;
    public void twoSum(int[] nums, int target, int i, int j){
        while(i < j){

            if(nums[i] + nums[j] > target) j--;
            else if(nums[i] + nums[j] < target) i++;
            else {
                while(i < j && nums[i] == nums[i+1]) i++;
                while(i < j && nums[j] == nums[j-1]) j--;
                List<Integer> temp = new ArrayList<>();
                temp.add(-target);
                temp.add(nums[i]);
                temp.add(nums[j]);

                ans.add(temp);
                i++;
                j--;
            }
        }

    }
    public List<List<Integer>> threeSum(int[] nums) {
        ans = new ArrayList<>();
        int len = nums.length;

        if(len < 3) return new ArrayList<List<Integer>>();
        // ans.clear();
        Arrays.sort(nums);

        for(int i=0;i<len;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int n1 = nums[i];
            int target = -n1;

            twoSum(nums, target, i+1, len-1);
        }

        return ans;


    }
}