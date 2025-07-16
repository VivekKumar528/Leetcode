class Solution {
    public int buyChoco(int[] arr, int money) {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                secMin = min;
                min = arr[i];
            } else if(arr[i] < secMin) secMin = arr[i];
        }
        return (min + secMin) > money ? money : money-(min + secMin);
    }
}