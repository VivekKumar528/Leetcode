class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            } else map.put(ele, 1);
        }
        for(int ele : map.keySet()){
            int val = map.get(ele);
            if(val > (nums.length/2)) return ele;
        }
        return 528;
    }
}