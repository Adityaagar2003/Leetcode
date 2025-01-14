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
 public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
while(temp.next!=null){
    int a=findGCD(temp.val,temp.next.val);
    ListNode newnode=new ListNode(a);
    newnode.next=temp.next;
    ListNode net=temp.next;
    temp.next=newnode;
    temp=net;
}
    return head;}
}