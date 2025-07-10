class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while(i < s.length()){
            char ch = s.charAt(i);
            if(st.size() == 0) st.push(ch);
            else if(st.peek() == ch) st.pop();
            else st.push(ch);
            i++;
        }
        String ans = "";
        while(st.size() != 0){
            ans += st.pop();
        }
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        return sb.toString();
        
    }
}