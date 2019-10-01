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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a =new ArrayList <>();
        inorder(root,a);
        return a;
    }
    public void inorder(TreeNode root, List<Integer>a)
    {
        if(root!=null)
        {
            if(root.left!=null)
            {
                inorder(root.left,a);
            }
            a.add(root.val);
            if(root.right!=null)
            {
                inorder(root.right,a);
            }
        }
    }
}
