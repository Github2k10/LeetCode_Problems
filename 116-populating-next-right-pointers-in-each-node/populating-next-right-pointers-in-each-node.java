/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        List<List<Node>> list = new ArrayList<>();
        
        helper(root, 0, list);

        for(List<Node> l : list){
            for(int i = 0; i < l.size(); i++){
                if(i == l.size() - 1){
                    l.get(i).next = null;
                } else {
                    l.get(i).next = l.get(i + 1);
                }
            }
        }

        return root;
    }

    private void helper(Node root, int l, List<List<Node>> list){
        if(root == null) return;
        if(l == list.size()) list.add(new ArrayList<>());

        list.get(l).add(root);

        helper(root.left, l + 1, list);
        helper(root.right, l + 1, list);
    }
}