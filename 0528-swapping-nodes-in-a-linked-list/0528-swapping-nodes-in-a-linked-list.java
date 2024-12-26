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
        ListNode back_node = head;
        ListNode front_node = head;
        ListNode curr = head;
        ListNode prev_front_node = null;
        ListNode prev_back_node = null;
        for(int i=0; i<k-1; i++){
            f = f.next;
        }
        front_node = f;
        while(f.next != null){
            f = f.next;
            back_node = back_node.next;
        }
        while(curr != null && curr.next != null){
            if(curr.next == front_node){
                prev_front_node = curr;
            }
            if(curr.next == back_node){
                prev_back_node = curr;
            }
            curr = curr.next;
        }
        int temp = front_node.val;
        front_node.val = back_node.val;
        back_node.val = temp;
        return head;
    }
}