class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(st.isEmpty()) st.add(ch);
            else if(ch == ')' && st.peek() == '(') st.pop();
            else st.add(ch);

        }

        return st.size();
    }
}