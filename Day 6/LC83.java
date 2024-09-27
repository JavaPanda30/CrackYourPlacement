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
class Solution 
{
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode aman = head;
        while( aman!=null&& aman.next!=null){
            if(aman.val!=aman.next.val){
                aman=aman.next;
            }
            else{
                aman.next=aman.next.next;
            }
        }
        return head;
    }
}