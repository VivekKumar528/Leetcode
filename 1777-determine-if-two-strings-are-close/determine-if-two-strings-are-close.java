class Solution {
    public boolean closeStrings(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if(len1 != len2) return false; 
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i=0;i<len1;i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            freq1[ch1 - 'a']++;
            freq2[ch2 - 'a']++;
        }
        for(int i =0;i<26;i++){
            if(freq1[i] != 0 && freq2[i] != 0) continue;
            if(freq1[i] == 0 && freq2[i] == 0) continue;

            return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i=0;i<26;i++) if(freq1[i] != freq2[i]) return false;
        return true;

    }
}