/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
       return(symmetric(root,root)); 
    }
    public boolean symmetric(TreeNode l,TreeNode r)
    {
        if(l==null && r==null)
        {
            return true;
        }
        if(l==null || r==null)
        {
            return false;
        }
        if(l.val!=r.val)
        {
            return false;
        }
        return(symmetric(l.left,r.right) && symmetric(l.right,r.left));
    }
}
