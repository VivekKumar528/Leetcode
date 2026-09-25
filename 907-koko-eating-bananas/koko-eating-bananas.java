class Solution {
    public int maxEle(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int ele : arr) max = Math.max(ele, max);
        return max;
    }
    public boolean canEatAll(int[] arr, int mid, int h){
        int actualHours = 0;
        for(int ele : arr){
            actualHours += ele/mid;

            if(ele % mid != 0) actualHours++;
        }

        return actualHours <= h;
    }
    public int minEatingSpeed(int[] arr, int h) {
        int len = arr.length;

        int l = 1;
        int r = maxEle(arr);

        while(l < r){
            int mid = l + (r - l)/2;
            if(canEatAll(arr, mid, h)) r = mid;
            else l = mid + 1;
        }
        return l;
    }
}