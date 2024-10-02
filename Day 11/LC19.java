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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        ListNode temp = head;
        while (n-- > 0) {
            temp = temp.next;
        }
        ListNode curr = head;
        if (temp == null) {
            return curr.next;
        }
        while (temp != null && temp.next != null) {
            temp = temp.next;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}