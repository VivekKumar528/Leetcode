class Solution {
    public int countZero(int i, int j, String str){
        int count = 0;
        for(int x=i;x<=j;x++){
            char ch = str.charAt(x);
            if(ch == '0') count++;
        }
        return count;
    }
    public int countOnes(int i, int j, String str){
        int count = 0;
        for(int x=i;x<=j;x++){
            char ch = str.charAt(x);
            if(ch == '1') count++;
        }
        return count;
    }
    public int maxScore(String str) {
        int zero = 0;
        int ones = 0;
        int max = 0;
        for(int i=0;i<=str.length()-2;i++){
            zero = countZero(0, i, str);
            ones = countOnes(i+1, str.length()-1, str);
            max = Math.max(max, zero + ones);
        }
        return max;
    }
}