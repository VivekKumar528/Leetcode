class Solution {
    public int maxProduct(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > firstMax){
                    secondMax = firstMax;
                    firstMax = arr[i];
                } else if(arr[i] > secondMax) secondMax = arr[i];
        }
        return (firstMax-1) * (secondMax-1);
    }
}