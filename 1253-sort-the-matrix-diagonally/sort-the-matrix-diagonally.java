class Solution {
    public int[][] diagonalSort(int[][] arr) {
        int m =arr.length;
        int n = arr[0].length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key = i-j;
                if(map.containsKey(key)){
                    map.get(key).add(arr[i][j]);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i][j]);
                    map.put(key, list);
                }
            }
        }
        for(int key : map.keySet()){
            Collections.sort(map.get(key));
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = map.get(i-j).remove(0);
            }
        }
        return arr;
    }
}