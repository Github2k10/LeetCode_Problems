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
        if(head.next == null) return head;
        ListNode node = head;
        ListNode cur = head.next;
        node.next = null;

        head = reverseList(cur);
        cur = head;
        while(cur.next != null) cur = cur.next;
        cur.next = node;

        return head;
    }
}