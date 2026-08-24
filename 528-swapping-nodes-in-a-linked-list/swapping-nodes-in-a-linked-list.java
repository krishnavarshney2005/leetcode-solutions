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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size  = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(size==1)return head;
        temp = head;
        int[] arr = new int[size];
        int i = 0;
        while(temp!=null && i<=size){
            arr[i] = temp.val;
            i++;
            temp = temp.next;
        }
        int x = k-1;
        int y = size-k;
       int tempValue = arr[x];
        arr[x] = arr[y];
        arr[y] = tempValue;
        temp = head;
        int s = 0;
        while(temp!=null && s<=size){
            temp.val = arr[s];
            s++;
            temp = temp.next;
        }
        return head;

    }
}