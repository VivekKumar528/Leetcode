class Solution {
    public String largestOddNumber(String str) {
        int len = str.length();
        for(int i=len-1;i>=0;i--){
            if((str.charAt(i) - '0') % 2 != 0 ) return str.substring(0, i+1);
        }
        return "";
    }
}