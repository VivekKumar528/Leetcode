class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        int res = start ^ goal;
        while(res != 0){
            if((res % 2) == 1) count++;
            res /= 2;
        }
        return count;
    }
}