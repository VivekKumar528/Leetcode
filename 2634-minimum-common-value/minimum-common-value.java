class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int ele : nums1) set1.add(ele);
        for(int ele : nums2) set2.add(ele);
        int ans = Integer.MAX_VALUE;
        for(int ele : set1){
            if(set2.contains(ele)){
                if(ele < ans) ans = ele;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}