class Solution {
    public boolean makeEqual(String[] arr) {
        int[] freq = new int[26];
        for(int i=0;i<arr.length;i++){
            String str = arr[i];
            for(int j=0;j<str.length();j++){
                char ch = str.charAt(j);
                freq[ch - 'a']++;
            }
        }
        for(int ele : freq){
            if(ele % arr.length != 0) return false;
        }
        return true;
    }
}