class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] idxArr = new int[26];
        Arrays.fill(idxArr, -1);
        int res = -1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(idxArr[ch - 'a'] == -1){
                idxArr[ch - 'a'] = i;
            } else res = Math.max(res, i - idxArr[ch - 'a'] - 1);
        }
        return res;

    }
}