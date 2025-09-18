class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int ele : nums){
            if(ele % 2 == 0) even.add(ele);
            else odd.add(ele);
        }
        int i = 0;
        for(int ele : even){
            nums[i++] = ele;
        }
        for(int ele : odd){
            nums[i++] = ele;
        }

        return nums;

    }
}