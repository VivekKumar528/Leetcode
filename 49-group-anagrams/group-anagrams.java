class Solution {
    public String generateWordFromFreq(String str){
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch - 'a']++;
        }
        StringBuilder newWord = new StringBuilder();

        for(int i=0;i<26;i++){
            int f = freq[i];
            if(f > 0){
                char letter = (char) (i + 'a');
                for(int j =0;j<f;j++){
                    newWord.append(letter);
                }
            }
        }
        return newWord.toString();

        
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int size = strs.length;

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0;i<size;i++){
            String word = strs[i];
            String newWord = generateWordFromFreq(word);
            if(map.containsKey(newWord)){
                map.get(newWord).add(word);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(word);
                map.put(newWord, temp);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(String key : map.keySet()){
            List<String> val = map.get(key);
            res.add(val);
        }
        return res;
    }
}