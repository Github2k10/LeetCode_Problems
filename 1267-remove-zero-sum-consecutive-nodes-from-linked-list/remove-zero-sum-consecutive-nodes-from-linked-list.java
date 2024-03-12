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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode cur = new ListNode(0);
        cur.next = head;

        int sum = 0;

        Map<Integer, ListNode> map = new HashMap<>();

        for(ListNode node = cur; node != null; node = node.next){
            sum += node.val;

            if(map.containsKey(sum)){
                ListNode pre = map.get(sum);
                ListNode rem = pre.next;
                int p = sum + (rem != null ? rem.val : 0);

                while(p != sum){
                    map.remove(p);
                    rem = rem.next;
                    p += (rem != null ? rem.val : 0);
                }

                pre.next = node.next;
            } else {
                map.put(sum, node);
            }
        }
        
        return cur.next;
    }
}