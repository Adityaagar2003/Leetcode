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
    public ListNode middleNode(ListNode head) {
         if (head == null) return null;
     int size=0;
     ListNode temp=head;
     while(temp!=null){
        temp=temp.next;
        size++;
     }   
     int mid=size/2 +1;
     temp=head;
     int i=0;
     while(i<mid-1){
        temp=temp.next;
        i++;
     }
   return temp; }
}