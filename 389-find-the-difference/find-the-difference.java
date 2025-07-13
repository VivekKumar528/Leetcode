class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int x=0;x<s.length();x++){
            char key = s.charAt(x);
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key, freq+1);
            } else map.put(key, 1);
        }
        for(int x=0;x<t.length();x++){
            char key = t.charAt(x);
            if(map.containsKey(key)){
                int freq = map.get(key);
                map.put(key, freq-1);
            } else map.put(key, -1);
        }
        char ans = '#';
        for(char key : map.keySet()){
            if(map.get(key) == -1) ans = key;
        }
        return ans;

    }
}