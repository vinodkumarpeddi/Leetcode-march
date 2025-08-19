/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetricHelp(TreeNode p,TreeNode q)
    {
        if(p==null || q==null)
        {
            return p==q;
        }
        return (p.val==q.val) && isSymmetricHelp(p.left,q.right) && isSymmetricHelp(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
        {
            return true;
        }
        return isSymmetricHelp(root.left,root.right);
    }
}