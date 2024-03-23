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
    private static ListNode[] temp = new ListNode[50000];
    public void reorderList(ListNode head) {
        ListNode[] arr = temp;
        
        int j = 0;
        ListNode cur = head;

        while(cur != null){
            arr[j] = cur;
            cur = cur.next;
            arr[j].next = null;
            j++;
        }

        boolean flag = j % 2 == 1;

        j--;
        int i = 0;
        ListNode node = new ListNode(0);
        while(i < j){
            node.next = arr[i];
            node = node.next;
            node.next = arr[j];
            node = node.next;

            i++;
            j--;
        }

        if(flag){
            node.next = arr[i];
        }
    }
}