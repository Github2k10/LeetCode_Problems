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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l = 0;
        ListNode cur = head;

        while(cur != null) {
            l++;
            cur = cur.next;
        }
        if(l == n) return head.next;

        cur = head;
        l -= n;

        for(int i = 0; i < l - 1; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;
        return head;
    }
}