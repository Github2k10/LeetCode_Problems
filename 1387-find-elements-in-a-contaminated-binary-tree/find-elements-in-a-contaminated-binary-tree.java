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
class FindElements {
    private Map<Integer, Boolean> map;
    public FindElements(TreeNode root) {
        map = new HashMap<>();
        if(root == null) return;

        root.val = 0;
        map.put(0, true);
        helper(root);
    }

    private void helper(TreeNode root){
        if(root == null) return;
        if(root.left != null){
            root.left.val = root.val * 2 + 1;
            map.put(root.left.val, true);
        }

        if(root.right != null){
            root.right.val = root.val * 2 + 2;
            map.put(root.right.val, true);
        }

        helper(root.left);
        helper(root.right);
    }
    
    public boolean find(int target) {
        return map.getOrDefault(Integer.valueOf(target), false);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */