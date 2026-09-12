class Solution {
    public String largestGoodInteger(String num) {
        int len = num.length();
        char max = ' ';
        for(int i=2;i<len;i++){
            if(num.charAt(i) == num.charAt(i-1) && num.charAt(i) == num.charAt(i-2)){
                if(num.charAt(i) > max) max = num.charAt(i);
            }
        }
        return max == ' ' ? "" : new String(new char[]{max, max, max});
    }
}