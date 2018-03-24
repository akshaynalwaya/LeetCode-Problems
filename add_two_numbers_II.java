/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode head = null;
        while(list1!=null){
            stk1.push(list1.val);
            list1 = list1.next;
        }
        while(list2!=null){
            stk2.push(list2.val);
            list2 = list2.next;
        }
        int result = 0;
        int carry = 0,a=0,b=0;
        int i=0;
        while(!stk1.isEmpty() || !stk2.isEmpty()){
            if(stk1.isEmpty())
                a = 0;
            else
                a = stk1.pop();
            if(stk2.isEmpty())
                b = 0;
            else
                b = stk2.pop();            
            int temp = a + b + carry;
            carry = temp/10;
            result = result + (int)Math.pow(10,i++) * (temp%10);
            ListNode sum = new ListNode(temp%10);
            sum.next = head;
            head = sum;
        }
        if(carry==1){
            ListNode sum = new ListNode(carry);
            sum.next = head;
            head = sum;
        }
        return head;
    }
}