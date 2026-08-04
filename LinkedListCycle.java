/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // we make slow and fast pointers, and if cycle is present they will eventualy meet. once they meet, we return true. simple

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)    return true;
        }
        return false;
    }
}