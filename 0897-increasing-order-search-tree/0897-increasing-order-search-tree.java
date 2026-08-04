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

    public TreeNode increasingBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        // Store inorder traversal
        inorder(root, list);

        // Create new tree
        TreeNode dummy = new TreeNode(0);
        TreeNode current = dummy;

        for (int value : list) {

            current.right = new TreeNode(value);
            current = current.right;

        }

        return dummy.right;
    }


    private void inorder(TreeNode root, List<Integer> list) {

        if (root == null)
            return;

        inorder(root.left, list);

        list.add(root.val);

        inorder(root.right, list);
    }
}