class Solution {
    public int reverse(int x) {
        long rev = 0;
        int c = x;
        x = Math.abs(x);
        while (x > 0) {
            long digit = x % 10;
            rev = rev * 10 + digit;
            x /= 10;
        }
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;
        System.out.print(Integer.MAX_VALUE);
        return c < 0 ? (int)-rev : (int)rev;
    }
}