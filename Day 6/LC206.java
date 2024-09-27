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
    public ListNode reverseList(ListNode head) {
        ListNode aman = head;
        ListNode prev = null;
        while(aman!=null){
            ListNode temp = aman.next;
            aman.next=prev;
            prev=aman;
            aman=temp;
        }
        return prev;
    }
}