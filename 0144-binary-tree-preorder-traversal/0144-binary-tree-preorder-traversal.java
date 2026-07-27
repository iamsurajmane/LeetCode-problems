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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helperPre(root,res);
        return res;
    }
    private void helperPre(TreeNode root ,List<Integer> result){
        if(root != null){  
            result.add(root.val);
            helperPre(root.left,result);
            helperPre(root.right,result);
        }
    }
}