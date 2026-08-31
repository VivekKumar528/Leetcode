class Solution {
    TreeNode deleteHelper(TreeNode root, HashSet<Integer> set, List<TreeNode> result){
        if(root == null) return null;

        root.left = deleteHelper(root.left, set, result);
        root.right = deleteHelper(root.right, set, result);

        if(set.contains(root.val)){
            if(root.left != null) result.add(root.left);
            if(root.right != null) result.add(root.right);

            return null;
        } else {
            return root;
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> result = new LinkedList<>();

        HashSet<Integer> set = new HashSet<>();

        for(int ele : to_delete) set.add(ele);
        
        deleteHelper(root, set, result);

        if(!set.contains(root.val)){
            result.add(root);
        }
        return result;

    }
}