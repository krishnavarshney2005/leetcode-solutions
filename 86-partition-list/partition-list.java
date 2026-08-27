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
    public ListNode partition(ListNode head, int x) {
        ListNode greathead = new ListNode(-1);
        ListNode great = greathead;
        ListNode lesshead = new ListNode(-1);
        ListNode less = lesshead;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val<x){
                less.next = temp;
                less = less.next;
                temp = temp.next;
            }
            else{
                great.next = temp;
                great = great.next;
                temp = temp.next;
            }
        }
        less.next = greathead.next;
        great.next = null;
        lesshead = lesshead.next;
        return lesshead;
    }
}