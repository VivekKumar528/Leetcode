class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i=0;i<s.length()-2;i++){
            int a = s.charAt(i);
            int b = s.charAt(i+1);
            int c = s.charAt(i+2);
            if(a != b && a != c && b != c) count++;
        }
        return count;
    }
}