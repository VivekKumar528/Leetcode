class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int len = seq.length();
        int[] ans = new int[len];
        int d = 0;
        for(int i=0;i<len;i++){
            char ch = seq.charAt(i);
            if(ch == '('){
                d++;
                ans[i] = d % 2 == 0 ? 0 : 1;
            } else {
                ans[i] = d % 2 == 0 ? 0 : 1;
                d--;
            }
        }
        return ans;
    }
}