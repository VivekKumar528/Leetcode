class Solution {
    public int totalFruit(int[] arr) {
        int len = arr.length;
        int l = 0, r = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (r < len) {
            int key = arr[r];
            if (map.containsKey(key)) {
                int freq = map.get(key);
                map.put(key, freq + 1);
            } else
                map.put(key, 1);
            while (map.size() > 2) {
                int freq = map.get(arr[l]);
                map.put(arr[l], freq - 1);
                if (map.get(arr[l]) == 0)
                    map.remove(arr[l]);
                l++;
            }
            if (map.size() <= 2)
                maxLen = Math.max(maxLen, r - l + 1);
            r++;
        }
        return maxLen;
    }
}

// class Solution {
//     public int totalFruit(int[] arr) {
//         int l = 0, r = 0, maxLen = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         while(r < arr.length){
//             if(map.containsKey(arr[r])){
//                 int freq = map.get(arr[r]);
//                 map.put(arr[r], freq+1);
//             } else map.put(arr[r], 1);
//             if(map.size() > 2){
//                 while(map.size() > 2){
//                     if(l < arr.length){
//                         int key = 0;
//                         key = arr[l];
//                         int freq = map.get(key);
//                         map.put(arr[l], freq-1);
//                         if (map.get(key) == 0) {
//                             map.remove(key);
//                         }
//                     } 
//                     l++;   
//                 }
//             }
//             if(map.size() <= 2) maxLen = Math.max(maxLen, r-l+1);
//             r++;
//         }
//         return maxLen;
        
//     }
// }