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
    public ListNode middleNode(ListNode head) {
        ListNode aman1 = head;
        ListNode aman2 = head;
        while (aman1.next != null && aman1.next.next != null) {
            aman1 = aman1.next.next;
            aman2 = aman2.next;
        }
        return aman1.next != null ? aman2.next : aman2;
    }
}