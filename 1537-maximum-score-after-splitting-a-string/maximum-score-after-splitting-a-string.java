class Solution {
    public int maxScore(String str) {
        int len = str.length();
        int score = Integer.MIN_VALUE;
        int zero = 0;
        int one = 0;
        for(int i=0;i<=len-2;i++){
            if(str.charAt(i) == '1') one++;
            else zero++;

            score = Math.max(score, zero-one);
        }
        if(str.charAt(len-1) == '1') one++;
        return score + one;
    }
}