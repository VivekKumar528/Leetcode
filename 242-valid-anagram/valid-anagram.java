class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        int i = 0;
        int j = 0;
        while(i < s.length() && j < t.length()){
            if(s1[i++] != t1[j++]) return false;
        }
        return true;
    }
}