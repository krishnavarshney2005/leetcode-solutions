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
    public boolean mirro(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        if(!mirro(p.left  , q.right)) return false;
        if(!mirro(p.right , q.left)) return false;
        return true;

    }
    public boolean isSymmetric(TreeNode root) {
     if(root ==null) return true;
     return mirro(root.left, root.right);
    }
}