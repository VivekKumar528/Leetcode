class Solution {
    public int[] twoSum(int[] arr, int target) {
        int len = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)) return new int[]{map.get(rem), i};
            else map.put(arr[i], i);
        }
        return new int[]{};
    }
}