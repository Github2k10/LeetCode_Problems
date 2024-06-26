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
    private List<Integer> list;
    public TreeNode balanceBST(TreeNode root) {
        list = new ArrayList<>();
        inOrder(root);

        return balanceTree(list, 0, list.size() - 1, new TreeNode());
    }

    private void inOrder(TreeNode root){
        if(root == null) return;

        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    private TreeNode balanceTree(List<Integer> list, int s, int e, TreeNode root){
        if(s > e){
            return root;
        }

        int mid = (s + e)/2;
        root = new TreeNode(list.get(mid));
        root.left = balanceTree(list, s, mid - 1, root.left);
        root.right = balanceTree(list, mid + 1, e, root.right);

        return root;
    }
}