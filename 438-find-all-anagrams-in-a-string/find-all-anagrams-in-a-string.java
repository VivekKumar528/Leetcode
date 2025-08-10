class Solution {
    public boolean allZero(int[] arr){
        for(int  ele : arr){
            if(ele != 0) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int len = s.length();

        
        int[] counter = new int[26];
        for(int i=0;i<p.length();i++){
            char ch = p.charAt(i);
            counter[ch - 'a']++;
        }

        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        int k = p.length();
        while(j < len){
            char ch = s.charAt(j);
            counter[ch - 'a']--;
            if(j - i + 1 == k){
                if(allZero(counter)){
                    list.add(i);
                }
                counter[s.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return list;
    }
}