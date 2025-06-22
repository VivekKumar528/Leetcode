class Solution {
    public int numberOfSubstrings(String s) {
        int size = s.length();
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', -1);
        map.put('b', -1);
        map.put('c', -1);
        for (int i = 0; i < size; i++) {

            map.put(s.charAt(i), i);
            if (map.get('a') != -1 && map.get('b') != -1 && map.get('c') != -1) {
                count = count + (1 + Math.min(map.get('a'), Math.min(map.get('b'), map.get('c'))));
            }
        }
        return count;

    }
}