class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
    
        return helper(nums,0,nums.length-1);     //maintaing a range of indexes from where we have to consider the nums array for selecting root
        
    }
    public TreeNode helper(int[] nums,int left,int right){
        if(left>right){return null;}                   //base case
        TreeNode root=new TreeNode(nums[(left+right)/2]);           //create a new node with the value of mid of array always (even after changing ranges , new mid will be root val)
        root.left=helper(nums,left,(left+right)/2-1);           //join the node which built from left range of nums to the root.left side 
        root.right=helper(nums,(left+right)/2+1,right);            //join the node which built from right range's mid to the root.right side
        return root;             //this the actual node which is getting returned to their respective subtree
     }
}