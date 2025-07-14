class Solution {
    public String destCity(List<List<String>> list) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(0).size();j++){
                String key = list.get(i).get(0);
                if(map.containsKey(key)){
                    int freq = map.get(key);
                    map.put(key, freq+1);
                } else map.put(key, 1);
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(0).size();j++){
                String key = list.get(i).get(1);
                if(!map.containsKey(key) || map.get(key) == 0) return key;
            }
        }
        return "";

    }
}