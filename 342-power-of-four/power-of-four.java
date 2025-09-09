class Solution {
    // public boolean isPerfectSquare(int num){
    //     int root = (int)(Math.sqrt(num));
    //     return (root*root == num);
    // }
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;
        return ((n & (n-1)) == 0) && n%3 == 1;
    }
}