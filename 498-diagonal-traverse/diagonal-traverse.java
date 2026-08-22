class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key = i+j;
                if(map.containsKey(key)){
                    List<Integer> val = map.get(key);
                    val.add(mat[i][j]);
                    map.put(key, val);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(mat[i][j]);
                    map.put(i+j, list);
                }
            }
        }
        int[] result = new int[m*n];
        int idx = 0;
        int count = 1;
        for(int key = 0; key < m + n - 1; key++){
            List<Integer> val = map.get(key);
            if(key % 2 == 0) Collections.reverse(val);
            for(int ele : val){
                result[idx++] = ele;
            }    
        }
        return result;
    }
}