class Solution {
    public int singleNumber(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;){
            if(arr[i] == arr[i+1]){
                i += 2;
            } else return arr[i];
        }
        return arr[arr.length-1];
    }
}