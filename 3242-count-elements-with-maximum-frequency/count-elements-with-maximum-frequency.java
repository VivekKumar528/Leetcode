class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int ele = arr[i];
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele, freq+1);
            } else map.put(ele, 1);
        }
        int maxFreq = 0;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > maxFreq){
                maxFreq = freq;
            }

        }
        int total = 0;
        for(int value : map.values()){
            if(value == maxFreq){
                total += value;
            }
        }
        return total;
    }
}