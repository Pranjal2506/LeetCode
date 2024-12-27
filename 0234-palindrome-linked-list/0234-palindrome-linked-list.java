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
        ArrayList<Integer> li1= new ArrayList<>();
        ListNode curr = head;
        while(curr != null){
            li1.add(curr.val);
            curr = curr.next;
        }
        ArrayList<Integer> li2 = new ArrayList<>(li1);
        Collections.reverse(li2);
        return li1.equals(li2);
    }
}