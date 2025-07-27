class Solution {
    public int getCommon(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int i = 0;
        int j = 0;
        while(i < len1 && j < len2){
            if(arr1[i] == arr2[j]) return arr1[i];
            else if(arr1[i] < arr2[j]) i++;
            else j++;
        }
        return -1;

    }
}