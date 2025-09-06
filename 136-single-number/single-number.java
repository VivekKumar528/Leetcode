class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            int ele = nums[i];
            if(map.containsKey(ele)){
                int val = map.get(ele);
                map.put(ele, val+1);
            } else map.put(ele, 1);
        }
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            if(freq == 1) return ele;
        }
        return 528;
    }
}