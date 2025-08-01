class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else {
                if(st.size() == 0) return false;
                char top = st.pop();
                if(top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']');
                else return false;
            }
        }
        return st.isEmpty();
    }
}