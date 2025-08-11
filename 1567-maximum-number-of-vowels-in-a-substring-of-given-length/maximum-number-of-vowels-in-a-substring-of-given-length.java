class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;

        return false;
    }
    public int maxVowels(String s, int k) {
        int maxVal = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        while(j < s.length()){
            if(isVowel(s.charAt(j))){
                count++;
            }
            if(j - i + 1 == k){
                maxVal = Math.max(count, maxVal);
                if(isVowel(s.charAt(i))){
                    count--;
                }
                i++;
            }
            j++;
        }
        return maxVal;
    }
}