class Solution {
    public int findKthPositive(int[] arr, int k) {
        int len = arr.length;
        int counting = 1;
        int i = 0;

        while(i < len && k > 0){
            if(arr[i] == counting) i++;
            else k--;

            counting++;
        }
        while(k --> 0) counting++;
        return counting-1;
    }
    
}