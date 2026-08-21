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
    public int numComponents(ListNode head, int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        ListNode temp = head;
        int count = 0;
        int ans = 0;
        while(temp!=null){
          if(map.containsKey(temp.val)){
            count = 1;
            
            temp = temp.next;
          }
          else{
           ans = ans + count;
            count = 0;
            temp = temp.next;
          }
        }
        ans = ans+count;
        return ans;
    }
}