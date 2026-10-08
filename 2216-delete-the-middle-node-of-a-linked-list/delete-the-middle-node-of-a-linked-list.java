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
    public ListNode deleteMiddle(ListNode head) {

        if(head.next==null){
            return null;
        }
        ListNode curr=head;
        int n= 0;

       
        while(curr != null){
            n++;
            curr=curr.next;
        }

        curr=head;
        for(int i=0;i<(n/2)-1;i++){
            curr=curr.next;
        }

        if(curr.next !=null && curr.next.next != null){
        curr.next=curr.next.next;
        }else{
            curr.next=null;
        }

        return head;
    }
}