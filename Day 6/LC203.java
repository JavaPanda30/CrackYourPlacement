/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode aman = new ListNode(-1);
        aman.next = head;
        ListNode temp = aman;
        while (aman != null && aman.next != null) {
            if (aman.next.val == val) {
                aman.next = aman.next.next;
            } else {
                aman = aman.next;
            }
        }
        return temp.next;
    }
}