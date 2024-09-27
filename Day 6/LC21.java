
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode aman = new ListNode();
        ListNode ans = aman;
        while(list1!=null && list2!=null){
            int val1 = list1.val;
            int val2 = list2.val;
            if(val1<=val2){
                list1=list1.next;
                ListNode val = new ListNode(val1);
                aman.next=val;
                aman=aman.next;
            }
            else if(val2<val1){
                list2=list2.next;
                ListNode val = new ListNode(val2);
                aman.next = val;
                aman=aman.next;
            }
        }
        if(list1!=null){
            aman.next=list1;
        }
        if(list2!=null){
            aman.next=list2;
        }
        return ans.next;
    }
}