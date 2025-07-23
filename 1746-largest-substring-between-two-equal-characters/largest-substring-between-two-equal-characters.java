class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = -1;
        for(int i=0;i<s.length();i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                int idx = map.get(key);
                res = Math.max(res, i-idx-1);
            } else {map.put(key, i);}
        }
        return res;

    }
}