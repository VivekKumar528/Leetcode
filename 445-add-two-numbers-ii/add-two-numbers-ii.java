class Solution {
    public ListNode reverseLL(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        ListNode nextNode = null;
        while (temp != null) {
            nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = reverseLL(l1);
        ListNode temp2 = reverseLL(l2);
        int sum = 0;
        int carry = 0;
        ListNode ans = new ListNode();
        while(temp1 != null || temp2 != null){
           if(temp1 != null){
            sum += temp1.val;
            temp1 = temp1.next;
           }

           if(temp2 != null){
            sum += temp2.val;
            temp2 = temp2.next;
           }

           ans.val = sum % 10;
           carry = sum/10;

           ListNode newNode = new ListNode(carry);
           newNode.next = ans;
           ans = newNode;
           sum = carry;    
        }
        return carry == 0 ? ans.next : ans;



    }
}