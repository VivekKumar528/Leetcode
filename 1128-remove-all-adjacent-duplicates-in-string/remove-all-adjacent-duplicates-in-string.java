class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(st.isEmpty()) st.push(ch);
            else if(ch == st.peek()) st.pop();
            else if(ch != st.peek()) st.push(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb = sb.reverse();
        String ans = sb.toString();
        return ans;
    }
}