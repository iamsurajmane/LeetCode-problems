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

    private int postIndex;
    private HashMap<Integer, Integer> map;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;
        map = new HashMap<>();

        // Store inorder value -> index
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(inorder, postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] inorder, int[] postorder, int left, int right) {

        // No elements
        if (left > right) {
            return null;
        }

        // Last element in postorder is the root
        int rootValue = postorder[postIndex--];

        TreeNode root = new TreeNode(rootValue);

        // Find root position in inorder
        int rootIndex = map.get(rootValue);

        // IMPORTANT:
        // Build right subtree first because we are
        // traversing postorder from right to left.
        root.right = build(inorder, postorder, rootIndex + 1, right);

        root.left = build(inorder, postorder, left, rootIndex - 1);

        return root;
    }
}