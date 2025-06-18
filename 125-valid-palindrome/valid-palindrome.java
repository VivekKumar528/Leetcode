class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch <='9') sb.append(ch);
        }
        // System.out.println(sb);
        String s1=sb.toString().toLowerCase();
        String s2=sb.reverse().toString().toLowerCase();
        return s1.equals(s2);
    }
}