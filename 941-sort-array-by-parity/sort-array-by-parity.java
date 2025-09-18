class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int ele : nums){
            if(ele % 2 == 0) even.add(ele);
            else odd.add(ele);
        }
        int i = 0;
        for(int ele : even){
            ans[i++] = ele;
        }
        for(int ele : odd){
            ans[i++] = ele;
        }

        return ans;

    }
}