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
        if(head==null || head.next ==null) return head;
        if(k==0) return head;
        ListNode temp = head;
        ListNode curr  = head;
         int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        k = k % n;
        if (k == 0) return head;

        temp = head;
        while(k>0 && temp!=null){
            temp = temp.next;
            k--;
        }
       
        while(temp.next !=null ){
            curr = curr.next;
            temp = temp.next;
        }
        ListNode headB = curr.next;
        temp.next = head;
        curr.next = null;
        
        return headB;
    }
}