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
    private List<List<Integer>> list;

    public int findBottomLeftValue(TreeNode root) {
        list = new ArrayList<>();
        helper(root, 0);
        return list.get(list.size() - 1).get(0);    
    }

    private void helper(TreeNode root, int level){
        if(root == null) return;
        if(list.size() == level) list.add(new ArrayList<>());
        list.get(level).add(root.val);

        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
}