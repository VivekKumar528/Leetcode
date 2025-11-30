class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] ans = new int[m*n];

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int key = i+j;
                if(map.containsKey(key)){
                    map.get(key).add(mat[i][j]);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(mat[i][j]);
                    map.put(i+j, list);
                }
            }
        }
        int idx = 0;
        for(int i=0;i<=((m-1)+(n-1));i++){
            List<Integer> list = map.get(i);
            if(i % 2 == 0) Collections.reverse(list);
            for(int ele : list){
                ans[idx++] = ele;
            }
        }
        return ans;

    }
}