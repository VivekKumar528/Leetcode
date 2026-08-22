class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key = i - j;
                if(map.containsKey(key)){
                    List<Integer> val = map.get(key);
                    val.add(mat[i][j]);
                    map.put(key, val);
                } else {
                    ArrayList<Integer> newList = new ArrayList<>();
                    newList.add(mat[i][j]);
                    map.put(i - j, newList);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                List<Integer> key = map.get(i - j);
                Collections.sort(key);
                mat[i][j] = key.get(0);
                key.remove(0);
            }
        }
        return mat;
    }
}