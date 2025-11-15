class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int idx = 0;
        while(idx < s.length()){
            if(st.size() == 0) st.push(s.charAt(idx));
            else if(s.charAt(idx) == st.peek()) st.pop();
            else st.push(s.charAt(idx));
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        while(st.size() != 0) sb.append(st.pop());
        return sb.reverse().toString();
    }
}