class Solution {
    List<String> ans;
    private void path(TreeNode root, StringBuffer sb){
        
        if(root == null)
            return;  
        
        path(root.left, new StringBuffer(sb.toString()+root.val+"->"));
        path(root.right, new StringBuffer(sb.toString()+root.val+"->"));
        
        if(root.left == null && root.right == null){
            sb.append(Integer.toString(root.val));
            ans.add(sb.toString());
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        path(root, new StringBuffer());
        return ans;
    }
}