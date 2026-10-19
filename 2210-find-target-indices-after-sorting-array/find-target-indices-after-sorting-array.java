class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int len = nums.length;
        List<Integer> ans = new ArrayList<>();
        int smallNumberCount = 0;
        for(int ele : nums) if(ele < target) smallNumberCount++;

        for(int ele : nums) if(ele == target) ans.add(smallNumberCount++);

        return ans;
    }
}