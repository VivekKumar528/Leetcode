class Solution {
    public int maxDepth(String s) {
        int openBracket = 0;
        int res = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                openBracket++;
            } else if(ch == ')') openBracket--;
            res = Math.max(openBracket, res);
        }
        return res;
    }
}