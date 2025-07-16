class Solution {
    public int minOperations(String str) {
        int startWith0 = 0; // 010101
        int startWith1 = 0; // 101010
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(i % 2 == 0){
                if(ch == '1') startWith0++;
                if(ch == '0') startWith1++;
            }
            else if(i % 2 != 0){
                if(ch == '0') startWith0++;
                if(ch == '1') startWith1++;

            }
        }
        return Math.min(startWith0, startWith1);
    }
}