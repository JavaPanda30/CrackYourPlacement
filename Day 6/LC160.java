


/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1 = size(headA);
        int l2 = size(headB);
        if (headA == headB) {
            return headA;
        }
        ListNode a = headA;
        ListNode b = headB;
        if (l1 <= l2) {
            while (b != null) {
                ListNode temp = b;
                b = b.next;
                while (temp != null) {
                    if (temp.next == a.next || temp.next == a) {
                        return temp.next;
                    }
                    temp = temp.next;
                }
                a = a.next;
            }
        } else if (l2 < l1) {
            while (a != null) {
                ListNode temp = a;
                a = a.next;
                while (temp != null) {
                    if (temp.next == b.next || temp.next == b) {
                        return temp.next;
                    }
                    temp = temp.next;
                }
                b = b.next;
            }
        }
        return a;
    }

    public static int size(ListNode list) {
        int ans = 0;
        while (list != null) {
            ans++;
            list = list.next;
        }
        return ans;
    }
}