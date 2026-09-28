class Solution {
    public int maxDepth(String s) {
        int openBracketCount = 0;
        int max = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                openBracketCount++;
                max = Math.max(openBracketCount, max);
            } else if(ch == ')') openBracketCount--;
        }
        return max;
    }
}