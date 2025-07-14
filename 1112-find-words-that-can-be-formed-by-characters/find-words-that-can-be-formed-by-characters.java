class Solution {
    public int check(String str, HashMap<Character, Integer> map){
        HashMap<Character, Integer> temp = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(temp.containsKey(ch)){
                int freq = temp.get(ch);
                temp.put(ch, freq+1);
            } else temp.put(ch, 1);
        }
        for(int x=0;x<str.length();x++){
            char ch = str.charAt(x);
            if (!map.containsKey(ch)) return 0;
            if(map.containsKey(ch) && temp.containsKey(ch)){
                if( temp.get(ch) > map.get(ch)){
                    return 0;
                }
            }
        }
        return str.length();
    }
    public int countCharacters(String[] arr, String chars) {
        int len = arr.length;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int x=0;x<chars.length();x++){
            if(map.containsKey(chars.charAt(x))){
                int freq = map.get(chars.charAt(x));
                map.put(chars.charAt(x), freq+1);
            } else map.put(chars.charAt(x), 1);
        }
        int sum = 0;
        for(int x=0;x<len;x++){
            sum = sum + check(arr[x], map);
        }
        return sum;
    }
}