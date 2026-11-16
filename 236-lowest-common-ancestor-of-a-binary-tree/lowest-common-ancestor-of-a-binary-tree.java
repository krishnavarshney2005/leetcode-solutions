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
    public boolean exists(TreeNode root , int data){
        if(root ==null) return false;
        if(root.val==data) return true;
        return exists(root.left , data) || exists(root.right , data);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root==p || root==q) return root;
        boolean pinleft = exists(root.left,p.val);
        boolean qinleft = exists(root.left,q.val);
        if(pinleft && qinleft) return lowestCommonAncestor(root.left,p,q);
         else if(!pinleft && !qinleft) return lowestCommonAncestor(root.right,p,q);
         else return root;
    }
}