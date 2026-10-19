class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int len = nums.length;
        int countSmallElementThanTarget = 0;
        for(int ele : nums) if(ele < target) countSmallElementThanTarget++;
        List<Integer> ans = new ArrayList<>();
        for(int ele : nums) if(ele == target) ans.add(countSmallElementThanTarget++);

        return ans;

    }
}