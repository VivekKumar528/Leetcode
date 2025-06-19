class Solution {
    public void rotate(int[] arr, int k) {
        int len = arr.length;
        k %= len;
        List<Integer> list1 = new ArrayList<>();
        for(int i=len-k;i<len;i++){
            list1.add(arr[i]);
        } 
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<len-k;i++){
            list2.add(arr[i]);
        }
        int idx = 0;
        for(int i=0;i<list1.size();i++){
            arr[idx++] = list1.get(i);
        }
        for(int i=0;i<list2.size();i++){
            arr[idx++] = list2.get(i);
        }
    }
}