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
     public void pre(TreeNode root  , ArrayList<Integer>  list){
        if(root==null) return ;
        
        pre(root.left,list);
        pre(root.right,list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
    
        ArrayList<Integer> list = new ArrayList<>();
         pre(root,list);
         return list;
    }
}