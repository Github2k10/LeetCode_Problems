/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur = null;

        while(node.next != null){
            cur = node;
            node.val = node.next.val;
            node = node.next;
        }

        cur.next = null;
    }
}