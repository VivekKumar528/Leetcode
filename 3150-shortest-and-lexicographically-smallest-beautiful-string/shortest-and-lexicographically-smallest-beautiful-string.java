class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int len=k;len<=n;len++){
            String result = "";

            for(int start=0;start<=n-len;start++){
                String temp = sb.substring(start, start + len);

                int ones = 0;
                for(char ch : temp.toCharArray()) ones += (ch == '1') ? 1 : 0;
                if(ones == k){ // beautiful
                    if(result.length() == 0 || temp.compareTo(result.toString()) < 0) result = temp;
                }
            }
            if(result.length() != 0) return result.toString();
        }
        return "";
    }
}