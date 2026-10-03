class Solution {
    public int longestValidParentheses(String s) {
        int len = s.length();

        int open = 0;
        int close = 0;

        int result = 0;
        //Left to Right

        for(int i=0;i<len;i++){
            if(s.charAt(i) == '(') open++;
            else close++;

            if(open == close){
                result = Math.max(result, open+close);
            } else if(close > open) open = close = 0;

        }
        open = close = 0;
        // Right to Left
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i) == ')') close++;
            else open++;

            if(open == close) result = Math.max(result, open+close);
            else if(open > close) open = close = 0;

        }
        return result;
    }
}