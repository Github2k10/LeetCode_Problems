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
    private int len;
    public long kthLargestLevelSum(TreeNode root, int k) {
        len = 0;
        long[] arr = new long[100000];
        helper(root, 0, arr);
        Arrays.sort(arr, 0 , len + 1);
        // System.out.println(Arrays.toString(arr));

        return len - k + 1 < 0 ? -1 : arr[len - k + 1];
    }

    private void helper(TreeNode root, int l, long[] arr){
        if(root == null) return;
        len = Math.max(len, l);
        arr[l] += root.val;

        helper(root.left, l + 1, arr);
        helper(root.right, l + 1, arr);
    }
}