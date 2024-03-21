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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode[] temp = helper(head);

        return temp[0];
    }

    private ListNode[] helper(ListNode head){
        if(head.next == null) return new ListNode[]{head, head};
        ListNode node = head;
        ListNode cur = head.next;
        node.next = null;

        ListNode[] temp = helper(cur);
        temp[1].next = node;
        temp[1] = node;

        return temp;
    }
}