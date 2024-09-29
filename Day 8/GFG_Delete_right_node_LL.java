
/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        // your code here
        Node reverse = reverse(head);
        Node temp = reverse;
        int max = Integer.MIN_VALUE;
        Node prev=null;
        while(temp!=null){
            max = Math.max(max,temp.data);
            if(temp.data < max){
                Node curr = temp;
                temp=temp.next;
                curr.next=null;
                prev.next=temp;
            }
            else{
            prev=temp;
            temp=temp.next;
            }
        }
        return reverse(reverse);
    }
    
    Node reverse(Node head){
        Node prev = null;
        Node temp = head;
        while(temp!=null){
            Node curr = temp.next;
            temp.next=prev;
            prev=temp;
            temp=curr;
        }
        return prev;
    }
}
 