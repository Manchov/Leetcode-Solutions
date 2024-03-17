
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;
        if (root.right == null && root.left == null)
            return root;
        if (root.right == null || root.left == null) {
            if (root.left == null) {
                root.left = invertTree(root.right);
                root.right = null;
                return root;
            } else if (root.right == null) {
                root.right = invertTree(root.left);
                root.left = null;
                return root;
            }
        }
        TreeNode treeNode = new TreeNode(root.val, root.left, root.right);
        root.right = invertTree(root.left);
        root.left = invertTree(treeNode.right);
        return root;

    }
}
