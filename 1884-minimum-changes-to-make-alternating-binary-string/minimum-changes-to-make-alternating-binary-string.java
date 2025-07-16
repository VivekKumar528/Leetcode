class Solution {
    public int minOperations(String str) {
        int len = str.length();
        String startWith1 = "";
        String startWith0 = "";
        for(int i=0;i<len;i++){
            if(i % 2 == 0){
                startWith1 += 1;
                startWith0 += 0;
            }
            else {
                startWith1 += 0;
                startWith0 += 1;
            }
        }
        int countStartWith0 = 0;
        int countStartWith1 = 0;
        for(int i=0;i<len;i++){
            char strCh = str.charAt(i);
            char startWith0Ch = startWith0.charAt(i);
            char startWith1Ch = startWith1.charAt(i);
            if(strCh != startWith1Ch) {
                countStartWith1++;
            } else countStartWith0++;
        }
        return Math.min(countStartWith0, countStartWith1);
    }
}