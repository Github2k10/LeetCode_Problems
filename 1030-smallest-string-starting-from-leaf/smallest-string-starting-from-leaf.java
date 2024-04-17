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
    String ans;
    public String smallestFromLeaf(TreeNode root) {
        ans = "zzzzzzzzzzzzzzzzzzzz";
        helper(root, new StringBuilder());

        return ans;
    }

    private void helper(TreeNode root, StringBuilder sb){
        if(root == null) return;

        if(root.left == null && root.right == null){
            sb.append((char)('a' + root.val));
            String st = sb.reverse().toString();
            
            if(st.compareTo(ans) < 0){
                ans = st;
            }
            return;
        }

        sb.append((char)('a' + root.val));

        helper(root.left, new StringBuilder(sb));
        helper(root.right, new StringBuilder(sb));
    }
}