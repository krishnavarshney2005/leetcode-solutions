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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
         if(head.next.next==null ) return  new int[]{-1,-1};
         int[] ans = new int[2];
         ListNode prev = head;
         ListNode curr = head.next;
         ListNode nextNode = curr.next;
         int min  =Integer.MAX_VALUE;
         int firstCritical = -1;
         int lastCritical = -1;
         int i = 2;
         while(nextNode!=null){
            if(curr.val>nextNode.val && curr.val>prev.val || curr.          val<nextNode.val && curr.val<prev.val){
               if(firstCritical==-1){
                firstCritical = i;
               }
               else{
                min = Math.min(min,i-lastCritical);
               }
               lastCritical = i;
            }
            
            nextNode = nextNode.next;
            curr = curr.next;
            prev = prev.next;
            i++;
         }
         if( lastCritical==firstCritical) {
             return  new int[]{-1,-1};
         }
         ans[0] = min;
         ans[1] = lastCritical-firstCritical;

         return ans;
    }
}