class Solution {
    public String breakPalindrome(String palindrome) {
        int len = palindrome.length();
        if(len == 0 || len == 1) return "";

        char[] x = palindrome.toCharArray();
        for(int i=0;i<len/2;i++){
            if(x[i] != 'a'){
                x[i] = 'a';
                return new String(x);
            }
        }
        x[len - 1] = 'b';
        return new String(x);
    }
}