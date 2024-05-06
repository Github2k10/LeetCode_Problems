/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;

        while(cur != null){
            if(stack.empty()){
                stack.push(cur);
            }

            while(!stack.empty() && cur.val > stack.peek().val) {
                stack.pop();
            }

            stack.push(cur);
            cur = cur.next;
        }

        head = new ListNode();
        cur = head;

        for(ListNode node : stack){
            cur.next = node;
            cur = cur.next;
            System.out.println(node.val);
        }

        return head.next;
    }
}