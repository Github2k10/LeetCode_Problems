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
    public ListNode doubleIt(ListNode head) {
        int c = helper(head);

        if(c != 0){
            ListNode node = new ListNode(c);
            node.next = head;
            head = node;
        }

        return head;
    }

    private int helper(ListNode head){
        if(head == null) return 0;

        int c = helper(head.next);

        int t = (head.val * 2) + c;
        head.val = t % 10;

        return t / 10;
    }
}