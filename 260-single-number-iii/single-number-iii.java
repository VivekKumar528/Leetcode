class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else map.put(ele, 1);
        }
        int[] ans = new int[2];
        int idx = 0;
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                ans[idx++] = key;
            }
        }
        return ans;
    }
}