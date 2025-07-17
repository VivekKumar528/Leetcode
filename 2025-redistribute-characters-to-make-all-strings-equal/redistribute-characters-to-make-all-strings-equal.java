class Solution {
    public boolean makeEqual(String[] arr) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                if(map.containsKey(ch)){
                    int freq = map.get(ch);
                    map.put(ch, freq+1);
                } else map.put(ch, 1);
            }
        }

        for(Character ch : map.keySet()){
            int value = map.get(ch);
            if(value % arr.length != 0) return false;
        }
        return true;
    }
}