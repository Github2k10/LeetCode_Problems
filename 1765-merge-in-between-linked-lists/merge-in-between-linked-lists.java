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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur = list1;
        ListNode node = null;

        while(b > 0){
            if(a == 1) node = cur;
            cur = cur.next;
            a--;
            b--;
        }

        node.next = list2;

        while(node.next != null){
            node = node.next;
        }

        node.next = cur.next;
        return list1;
    }
}