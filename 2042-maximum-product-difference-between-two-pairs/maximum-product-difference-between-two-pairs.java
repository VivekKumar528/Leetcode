class Solution {
    public int maxProductDifference(int[] arr) {
        // 2 big - 2 small
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstSmall = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            } else if(arr[i] > secondMax){
                secondMax = arr[i];
            }

            if(arr[i] < firstSmall){
                secondSmall = firstSmall;
                firstSmall = arr[i];
            } else if(arr[i] < secondSmall){
                secondSmall = arr[i];
            }
        }
        return (firstMax * secondMax) - (firstSmall * secondSmall); 
    }
}