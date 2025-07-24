class Solution {
    public int[][] divideArray(int[] arr, int k) {
        Arrays.sort(arr);
        if(arr.length % 3 != 0) return new int[0][0];
        List<int[]> res = new ArrayList<>();
        for(int i=0;i<arr.length;i+=3){

            if(arr[i+2] - arr[i] > k){
                return new int[0][0];
            }
            res.add(new int[]{arr[i], arr[i+1], arr[i+2]});
        }
        return res.toArray(new int[res.size()][] );

    }
}