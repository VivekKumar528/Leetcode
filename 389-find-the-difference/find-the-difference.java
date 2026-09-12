class Solution {
    public char findTheDifference(String s, String t) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for(char ch : s.toCharArray()){
        //     if( map.containsKey(ch)){
        //         int val = map.get(ch);
        //         map.put(ch, val+1);
        //     } else map.put(ch, 1);
        // }
        // for(char ch : t.toCharArray()){
        //     if(!map.containsKey(ch)) return ch;
        //     else {
        //         int val = map.get(ch);
        //         map.put(ch, val-1);
        //     }
        // }
        // return 'a';

        int sAsciiSum = 0;
        for(char ch : s.toCharArray()){
            sAsciiSum += (int)ch;
        }
        int tAsciiSum = 0;
        for(char ch : t.toCharArray()){
            tAsciiSum += (int)ch;
        }
        return  (char)Math.abs(sAsciiSum - tAsciiSum);
    }
}