class Solution {
    public String maximumOddBinaryNumber(String s) {
        int len = s.length();
        int oneCount = 0;
        for(char ch : s.toCharArray()){
            if(ch == '1') oneCount++;
        }
        int j = 0;
        StringBuilder sb = new StringBuilder("0".repeat(len));
        while(oneCount > 1){
            sb.setCharAt(j, '1');
            j++;
            oneCount--;
        }
        sb.setCharAt(len-1, '1');
        return sb.toString();
    }
}