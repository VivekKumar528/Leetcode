class Solution {
    public int[] findOriginalArray(int[] changed) {
        int len = changed.length;
        if(len % 2 == 1) return new int[0];
        Arrays.sort(changed);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            int key = changed[i];
            if(map.containsKey(key)){
                int val = map.get(key);
                map.put(key, ++val);
            } else {
                map.put(key, 1);
            }
        }
        int[] ans = new int[len/2];
        int idx = 0;
        int zeroCount = map.getOrDefault(0, 0);
        if(zeroCount % 2 != 0) return new int[0];
        for(int ele : changed){
            int twice = 2 * ele;
            int freq = map.get(ele);
            if(freq == 0) continue;
            if(!map.containsKey(twice) || map.get(twice) == 0) return new int[0];
            ans[idx++] = ele;
            int numFreq = map.get(ele);
            map.put(ele, --numFreq);
            int twiceFreq = map.get(twice);
            map.put(twice, --twiceFreq);

        }
        return ans;

    }
}