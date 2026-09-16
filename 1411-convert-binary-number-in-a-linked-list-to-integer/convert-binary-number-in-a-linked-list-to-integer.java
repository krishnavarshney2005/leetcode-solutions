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
    public int getDecimalValue(ListNode head) {
        int count = 0;
        int sum = 0;
        ListNode temp = head;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        int i = count-1;
        while(temp!=null && i>=0){
            sum = sum +(int) Math.pow(2,i)*temp.val;
            temp = temp.next;
            i--;
        }
        return sum;
    }
}