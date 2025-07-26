class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != '*') st.push(ch);
            else if(i != 0 && ch == '*') {
                st.pop();
            }
        }
        String ans = "";
        while(st.size() != 0){
            ans = st.pop() + ans;
        }
        return ans;
    }
}