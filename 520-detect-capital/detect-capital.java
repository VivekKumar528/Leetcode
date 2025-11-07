class Solution {
    public boolean detectCapitalUse(String word) {
        int countCapital = 0;
        for(char ch : word.toCharArray()){
            if(ch >= 'A' && ch <= 'Z') countCapital++;
        }
        int len = word.length();
        if(countCapital == len || countCapital == 0 || (countCapital == 1 && Character.isUpperCase(word.charAt(0)))) return true;

        return false;
    }
}