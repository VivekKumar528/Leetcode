class Solution {
    public int maxScore(String str) {
        int totalOnes = 0;
        int res = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1') totalOnes++;
        }
        int zero = 0;
        int one = 0;
        for(int i=0;i<=str.length()-2;i++){
            if(str.charAt(i) == '0') zero++;
            else one++;
            int rightOnes = totalOnes - one;
            res = Math.max(res, zero + rightOnes);
        }
        return res;
    }
}