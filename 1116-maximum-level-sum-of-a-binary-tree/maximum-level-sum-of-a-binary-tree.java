class Solution {
    public void inOrder(TreeNode root, int level, HashMap<Integer, Integer> map){
        if(root == null) return;
        inOrder(root.left, level+1, map);
        if(map.containsKey(level)){
            int levelSum = map.get(level);
            levelSum += root.val;
            map.put(level, levelSum);
        } else map.put(level, root.val);
        inOrder(root.right, level+1, map);



    }  
    public int maxLevelSum(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>(); // level, sum
        inOrder(root, 1, map);

        int maxSum = Integer.MIN_VALUE;
        int resLevel = 1;
        for(int level : map.keySet()){
            int levelSum = map.get(level);
            if(levelSum > maxSum){
                maxSum = levelSum;
                resLevel = level; 
            }
        }
        return resLevel;
    }
}