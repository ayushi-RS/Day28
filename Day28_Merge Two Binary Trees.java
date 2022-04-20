class Solution {
    private TreeNode merge(TreeNode root1, TreeNode root2){
        TreeNode root = null;
        if(root1 == null && root2 == null)
            return null;
        else if(root1 == null && root2 != null){
            root = new TreeNode(root2.val);
            root.left = merge(root1, root2.left);
            root.right = merge(root1, root2.right);
        }else if(root1 != null && root2 == null){
            root = new TreeNode(root1.val);
            root.left = merge(root1.left, root2);
            root.right = merge(root1.right, root2);
        }else{
            root = new TreeNode(root1.val + root2.val);
            root.left = merge(root1.left, root2.left);
            root.right = merge(root1.right, root2.right);
        }
        return root;
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(root1, root2);
    }
}