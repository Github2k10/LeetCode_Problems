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
    public TreeNode replaceValueInTree(TreeNode root) {
        int[] arr = new int[100000];
        helper(root, 0, arr);
        set(root, 0, arr);
        root.val = 0;
        return root;
    }

    private void helper(TreeNode root, int l, int[] arr){
        if(root == null) return ;
        arr[l] += root.val;

        helper(root.left, l + 1, arr);
        helper(root.right, l + 1, arr);
    }

    private void set(TreeNode root, int l, int[] arr){
        if(root == null) return;
        if(root.left == null && root.right == null) return;
        
        int k = arr[l + 1];
        if(root.left != null) k -= root.left.val;
        if(root.right != null) k -= root.right.val;

        if(root.left != null) root.left.val = k;
        if(root.right != null) root.right.val = k;

        set(root.left, l + 1, arr);
        set(root.right, l + 1, arr);
    }
}