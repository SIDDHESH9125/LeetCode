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
   
    public ListNode rotateRight(ListNode head, int k) {
        if (head== null){
            return head;
        }
        if(head.next==null || k==0){
            return head;
        }
        ListNode curr=head;
        int length=1;
        while(curr.next != null){
            curr=curr.next;
            length++;
        }
       
        k=k%length;
        
        if( k == 0){
            return head;
        }

        curr.next=head;

        int steps=length-k;
        ListNode tail=head;

        for(int i =1 ;i< steps;i++){
            tail=tail.next;
        }
        
        ListNode newHead=tail.next;
        tail.next=null;

        return newHead;
        
    }
}