class Solution {
    public boolean check(String str, char start, char end){
        for(char ch : str.toCharArray()){
            if(ch < start || ch > end) return false;
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        if(check(word, 'A', 'Z') || check(word, 'a', 'z') || check(word.substring(1), 'a', 'z')) return true;
        return false;
    }

}