class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int count_ = 0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'L') countL++;
            else if(ch == 'R') countR++;
            else count_++;
        }
        if(countL == countR) return count_;
        return count_ + Math.abs(countL - countR);
    }
}