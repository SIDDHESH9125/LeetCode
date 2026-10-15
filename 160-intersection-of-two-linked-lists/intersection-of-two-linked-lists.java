/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a= headA;
        ListNode b= headB;

        while( a != null){
            while ( b != null){
                if( a == b){
                    return a;
                }
                b=b.next;

            }
            b=headB;
            a=a.next;
        }
        return null;
    }
}