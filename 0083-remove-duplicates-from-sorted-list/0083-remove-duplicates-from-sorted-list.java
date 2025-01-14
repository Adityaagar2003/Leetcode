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
    public ListNode deleteDuplicates(ListNode head) {
       if (head == null) return null;
        HashSet<Integer> hs=new HashSet<>();
        ListNode temp=head;
        hs.add(temp.val);
        while(temp != null && temp.next != null){
            if(hs.contains(temp.next.val)) {
                temp.next=temp.next.next;
            }
            else {hs.add(temp.next.val);
            temp=temp.next;
        }}
       
   return head; }
}