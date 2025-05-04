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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        boolean flag=false;
        if(root!=null)
        {
            q.add(root);
        }
        while(!q.isEmpty())
        {
            int n=q.size();
            List<Integer> newls=new ArrayList<>();
            for(int i=0;i<n;i++)
            { 
                TreeNode node=q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                newls.add(node.val);
                
            }
           if(flag)
           {
            Collections.reverse(newls);
           }
           ls.add(newls);
           flag=!flag;


        }
        return ls;
    }
}