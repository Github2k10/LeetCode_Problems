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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null) return true;
        ListNode slow = head, fast = head, pre = null;

        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        pre.next = null;
        ListNode node = reverse(slow)[0];

        while(head != null){
            if(head.val != node.val) return false;
            head = head.next;
            node = node.next;
        }

        return true;
    }

    private ListNode[] reverse(ListNode head){
        if(head.next == null) return new ListNode[]{head, head};
        ListNode node = head;
        ListNode cur = head.next;
        node.next = null;

        ListNode[] temp = reverse(cur);
        temp[1].next = node;
        temp[1] = node;

        return temp;
    }
}