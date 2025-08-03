class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int res = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            } else if(ch == ')') st.pop();
            res = Math.max(res, st.size());
        }
        return res;
    }
}