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
        if(head.next == null || head == null) return true;

        int[] arr = new int[100000];
        int i = 0;
        while(head != null){
            arr[i] = head.val;
            head = head.next;
            i++;
        }
        i--;

        int j = 0;

        while(j < i){
            if(arr[i] != arr[j]) return false;
            i--;
            j++;
        }


        return true;
    }
}