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
    public ListNode swapPairs(ListNode head) {
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode curr = prev;
        while(curr != null && curr.next != null && curr.next.next != null){
            ListNode one = curr.next;
            ListNode two = curr.next.next;

            one.next = two.next;
            two.next = one;

            curr.next = two;
            curr = one;
        }
        return prev.next;
    }
}