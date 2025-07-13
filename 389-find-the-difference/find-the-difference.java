class Solution {
    public char findTheDifference(String s, String t) {
        int sumS = 0;
        int sumT = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            sumS += (int)ch;
        }
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            sumT += (int)ch;
        }
        return (char)Math.abs(sumS - sumT);
    }
}