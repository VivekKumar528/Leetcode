class Solution {
    public boolean isPalindrome(int x) {
        long rev = 0;
        int original = x;
        while(x > 0){
            int lastDigit = x % 10;
            rev = rev * 10 + lastDigit;
            x /= 10;
        }
        if(rev == original) return true;
        return false;
    }
}