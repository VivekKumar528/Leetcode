class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        return false;
    }
    // public void swap(char ch1 ,char ch2){
        
    // }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int len = s.length();
        int i = 0;
        int j = len - 1;
        while(i < j){
            if(!isVowel(s.charAt(i))) i++;
            else if(!isVowel(s.charAt(j))) j--;
            else {
                // swap(s.charAt(i), s.charAt(j));
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }

        }
        return sb.toString();
    }
}