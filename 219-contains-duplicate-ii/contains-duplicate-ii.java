class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = arr.length;
        for(int i=0;i<len;i++){
            int key = arr[i];
            if(map.containsKey(key)){
                int idx = map.get(key);
                if(Math.abs(idx - i) <= k) return true;
            } 
            map.put(key, i);
        }
        return false;
    }
}