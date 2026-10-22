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
   ListNode reverse(ListNode temp){
        ListNode prev=null;

        while(temp != null){
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }

    ListNode getKNode(ListNode temp, int k){
        k-=1;
        while(temp != null && k>0){
           k--;
           temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next==null){
            return head;
        }

        ListNode curr=head;
        ListNode prev=null;

        while(curr != null){
            ListNode kNode = getKNode(curr,k);
            if(kNode == null){
                if(prev != null) prev.next=curr;
                break;
            }

            ListNode nextNode=kNode.next;
            kNode.next= null;
            reverse(curr);
            if(curr == head){
                head=kNode;
            }else{
                prev.next=kNode;
            }

            prev=curr;
            curr=nextNode;
        }return head;
    }
}