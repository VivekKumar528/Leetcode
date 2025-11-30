class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new LinkedList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String temp = strs[i];
            char[] ch = temp.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            
            if(map.containsKey(key)){
                List<String> tempList = map.get(key);
                tempList.add(strs[i]);
                map.put(key,  tempList);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                map.put(key, newList);
            }
        }
        for(String k : map.keySet()){
            ans.add(map.get(k));
        }
        return ans;
    }
}