class Solution {
    public String largestGoodInteger(String num) {
        int len = num.length();
        char maxChar = ' ';
        for(int i=2;i<len;i++){
            if(num.charAt(i-1) == num.charAt(i) && num.charAt(i-2) == num.charAt(i-1)) maxChar = (char)Math.max(maxChar, num.charAt(i));
        }
        return maxChar == ' '? "" : "" + maxChar + maxChar + maxChar;
    }
}