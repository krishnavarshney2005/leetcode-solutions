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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr!=null){
            ListNode  forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
            
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        
        ListNode rev1 = reverse(head);
        ListNode temp = rev1;
        ListNode pre = null;
        int x = 0;
        while(temp!=null){
            x = x+ temp.val*2;
            if(x>9){
                temp.val = x%10;
                x = 1;
            }
            else{
                temp.val = x;
                x = 0;
            }
            pre = temp;
            temp = temp.next;
            
        }
        if(x==1){
                ListNode dummy  = new ListNode(x);
                pre.next = dummy;
            }
        return reverse(rev1);
    }
}