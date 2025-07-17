class Solution {
    public int minOperations(String str) {
        int len = str.length();
        int startWith0 = 0; // 010101
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i % 2 == 0){
                if(ch == '1') startWith0++;
            }
            else if(i % 2 != 0){
                if(ch == '0') startWith0++;
            }
        }
        int startWith1 = len - startWith0; // 101010
        return Math.min(startWith0, startWith1);
    }
}