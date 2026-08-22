class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<len;i++){
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(map.containsKey(sorted)){
                List<String> val = map.get(sorted);
                val.add(str);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(sorted, temp);
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