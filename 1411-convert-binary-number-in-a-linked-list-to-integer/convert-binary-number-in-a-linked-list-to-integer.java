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
    private int res;
    public int getDecimalValue(ListNode head) {
        res = 0;
        helper(head);
        return res; 
    }

    private int helper(ListNode head){
        if(head.next == null){
            res += head.val == 1 ? 1 : 0;
            return 1;
        }

        int pow = helper(head.next);
        res += head.val == 1 ? Math.pow(2, pow) : 0;
        return pow + 1;
    }
}