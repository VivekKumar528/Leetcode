class Solution {
    public int compress(char[] chars) {
        int n = chars.length;

        int index = 0;
        int i = 0;

        while(i < n){
            char currCh = chars[i];
            int count = 0;

            while(i < n && chars[i] == currCh){
                count++;
                i++;
            }
            chars[index] = currCh;
            index++;

            if(count > 1){
                String countStr = Integer.toString(count);
                for(char ch : countStr.toCharArray()){
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
    }
}