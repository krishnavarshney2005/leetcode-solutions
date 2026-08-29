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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode [] ans  = new ListNode[k];
     
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int basesize = len/k;
        int extrasize = len%k;
        ListNode prev = null;
        ListNode curr = head;
        for(int p =0 ;p<k;p++){
            if(curr==null){
                ans[p] = curr;
                continue;
            }
            ans[p] = curr;
            
            int width = basesize + (extrasize>0 ?1:0);
            extrasize--;
            for(int i = 1;i<=width;i++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            prev = null;
            
        }
        return ans;
    }
}