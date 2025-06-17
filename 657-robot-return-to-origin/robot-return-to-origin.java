class Solution {
    public boolean judgeCircle(String moves) {
        int countU = 0;
        int countD = 0;
        int countL = 0;
        int countR = 0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'U') countU++;
            else if(ch == 'D') countD++;
            else if(ch == 'L') countL++;
            else countR++;
        }
        if(countU == countD && countL == countR) return true;
        return false;
    }
}