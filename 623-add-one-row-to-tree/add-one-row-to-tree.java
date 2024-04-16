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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode(val);
            node.left = root;
            root = node;
        } else {
            helper(root, val, depth, 2);
        }

        return root;
    }

    private void helper(TreeNode node, int val, int depth, int level){
        if(node == null) return ;
        if(depth == level){
            TreeNode temp = new TreeNode(val);
            if(node.left == null){
                temp.right = node.right;
                node.right = temp;
                node.left = new TreeNode(val);
            } else if(node.right == null){
                temp.left = node.left;
                node.left = temp;
                node.right = new TreeNode(val);
            } else {
                temp.left = node.left;
                node.left = temp;

                temp = new TreeNode(val);
                temp.right = node.right;
                node.right = temp;
            }
        }

        helper(node.left, val, depth, level + 1);
        helper(node.right, val, depth, level + 1);
    }
}