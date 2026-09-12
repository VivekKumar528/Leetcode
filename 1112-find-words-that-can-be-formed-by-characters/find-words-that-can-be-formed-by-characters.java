class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        int res = 0;
        for(char ch : chars.toCharArray()) charCount[ch - 'a']++;
        for(String word : words){
            int[] wordFreq = new int[26];
            for(char ch : word.toCharArray()) wordFreq[ch-'a']++;

            boolean ok = true;

            for(int i=0;i<26;i++){
                if(wordFreq[i] > charCount[i]) {
                    ok = false;
                    break;
                }
                
            }
            if(ok == true) res += word.length();
        }
        return res;

        
    }
}