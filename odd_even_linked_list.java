/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode temp = new ListNode(0);
        int count = 0;
        while(odd.next!=null && even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            if(count == 0){
                temp = even;
                count=1;                
            }
            if(odd.next==null){
                odd.next = temp;
                even.next = null;
                break;
            }
            odd.next = temp;
            even = even.next;
        }
        return head;
    }    
}