class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        int len = arr.length;

        if(n == 0) return true;

        for(int i=0;i<len;i++){
            if(arr[i] == 0){
                boolean isLeftEmpty = (i == 0) || arr[i-1] == 0;
                boolean isRightEmpty = (i == len-1) || arr[i+1] == 0;

                if(isLeftEmpty && isRightEmpty) {
                    arr[i] = 1;
                    n--;
                }
                if(n == 0) return true;
            }
        }
        return false;
    }
}