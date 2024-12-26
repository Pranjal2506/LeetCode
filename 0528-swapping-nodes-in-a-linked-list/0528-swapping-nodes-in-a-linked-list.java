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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode f = head;
        ListNode front = head;
        ListNode back = head;
        for(int i=0; i<k-1; i++){
            f = f.next;
        }
        front = f;
        while(f.next != null){
            f=f.next;
            back = back.next;
        }
        int temp = front.val;
        front.val = back.val;
        back.val = temp;
        return head;
    }
}