class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
        return false;
    }
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vowel = new HashMap<>();
        HashMap<Character, Integer> consonant = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                if(vowel.containsKey(ch)){
                    int freq = vowel.get(ch);
                    vowel.put(ch, freq+1);
                } else vowel.put(ch, 1);
            } else {
                if(consonant.containsKey(ch)){
                    int freq = consonant.get(ch);
                    consonant.put(ch, freq+1);
                } else consonant.put(ch, 1);
            }
        }
        int vowelFreq = 0;
        int consonantFreq = 0;

        for(char ele : vowel.keySet()){
            int freq = vowel.get(ele);
            vowelFreq = Math.max(vowelFreq, freq);
        }
        
        for(char ele : consonant.keySet()){
            int freq = consonant.get(ele);
            consonantFreq = Math.max(consonantFreq, freq);
        }
        return vowelFreq + consonantFreq;
    }
}