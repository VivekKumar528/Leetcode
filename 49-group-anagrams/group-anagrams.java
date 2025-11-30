class Solution {
    public String generate(String str){
        int[] arr = new int[26];
        for(char ch : str.toCharArray()){
            arr[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            int freq = arr[i];
            if(freq > 0){
                sb.append((char)(i + 'a'));
                sb.append(freq);
            }
        }
        return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            String word = strs[i];
            String newWord = generate(word);
            if(map.containsKey(newWord)){
                List<String> list = map.get(newWord);
                list.add(word);
                map.put(newWord, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(newWord, list);
            }
        }

        for(String key : map.keySet()){
            ans.add(map.get(key));
        }

        return ans;
    }
}