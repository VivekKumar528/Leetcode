class Solution {
    public String removeStars(String s) {
        int len = s.length();
        Character[] arr = new Character[len];
        int j = 0;
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch != '*') arr[j++] = ch;
            else{
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < j; i++){
            sb.append(arr[i]);
        }

        return sb.toString();
    }
}