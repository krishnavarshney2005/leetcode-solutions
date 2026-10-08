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
        list.add(root.val);
        
        pre(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
         ArrayList<Integer> list = new ArrayList<>();
         pre(root,list);
         return list;
    
    }
}