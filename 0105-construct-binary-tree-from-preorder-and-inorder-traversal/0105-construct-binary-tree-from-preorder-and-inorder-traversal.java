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

    int preIndex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1, map);
    }

    private TreeNode build(int[] preorder, int left, int right,
                           HashMap<Integer, Integer> map) {

        // No elements in this range
        if (left > right) {
            return null;
        }

        // First element in preorder is the root
        int rootValue = preorder[preIndex++];

        TreeNode root = new TreeNode(rootValue);

        // Find root's position in inorder
        int rootIndex = map.get(rootValue);

        // Build left subtree
        root.left = build(preorder, left, rootIndex - 1, map);

        // Build right subtree
        root.right = build(preorder, rootIndex + 1, right, map);

        return root;
    }
}